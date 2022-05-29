package com.dave.java.files;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.Executors;

public class TreeWatcher {
    static void watchDir(Path dir) {
        try {
            WatchService watchService = FileSystems.getDefault().newWatchService();
            dir.register(watchService, StandardWatchEventKinds.ENTRY_DELETE);
            Executors.newSingleThreadScheduledExecutor().submit(() -> {
                try {
                    WatchKey watchKey = watchService.take();
                    for (WatchEvent event : watchKey.pollEvents()) {
                        System.out.println("evt.context():" + event.context() + " evt.count():" + event.count() + " evt.kind()" + event.kind());
                        System.exit(0);
                    }
                } catch (InterruptedException e) {
                    return;
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        Directories.refreshTestDir();
        Directories.populateTestDir();
        Files.walk(Paths.get("test"))
                .filter(Files::isDirectory)
                .forEach(TreeWatcher::watchDir);
        PathWatcher.delTxtFiles();
    }
}
