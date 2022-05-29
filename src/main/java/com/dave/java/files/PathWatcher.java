package com.dave.java.files;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PathWatcher {
    static Path test = Paths.get("test");
    static void delTxtFiles() {
        try {
            Files.walk(test)
                    .filter(f -> f.toString().endsWith(".txt"))
                    .forEach(f -> {
                        try {
                            System.out.println("del " + f);
                            Files.delete(f);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        Directories.refreshTestDir();
        Directories.populateTestDir();
        Files.createFile(test.resolve("Hello.txt"));
        WatchService watchService = FileSystems.getDefault().newWatchService();
        test.register(watchService, StandardWatchEventKinds.ENTRY_DELETE);
        Executors.newSingleThreadScheduledExecutor()
                .schedule(
                        PathWatcher::delTxtFiles,
                        250,
                        TimeUnit.MILLISECONDS
                );
        //main线程等待
        WatchKey watchKey = watchService.take();
        for (WatchEvent event : watchKey.pollEvents()) {
            System.out.println("evt.context():" + event.context() + " evt.count():" + event.count() + " evt.kind()" + event.kind());
            System.exit(0);
        }
    }
}
