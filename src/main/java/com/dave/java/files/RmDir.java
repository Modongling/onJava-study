package com.dave.java.files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RmDir {
    public static void rmdir(Path dir) throws IOException {
        Files.walkFileTree(dir, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.delete(file);
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                Files.delete(dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }
}

class Directories {
    static Path path = Paths.get("test");
    static String sep = FileSystems.getDefault().getSeparator();
    static List<String> parts = Arrays.asList("foo", "bar", "baz", "bag");
    static Path makeVariant() {
        //旋转list
        Collections.rotate(parts, 1);
        return Paths.get("test", String.join(sep, parts));
    }

    static  void refreshTestDir() throws IOException {
        if (Files.exists(path)) {
            RmDir.rmdir(path);
        } else  {
            Files.createDirectory(path);
        }
    }

    public static void main(String[] args) throws IOException {
        refreshTestDir();
        Files.createFile(path.resolve("Hello.txt"));
        Path variant = makeVariant();
        try {
            Files.createDirectory(variant);
        } catch (Exception e) {
            System.out.println("Nope, that doesn't work");
        }
        populateTestDir();
        Path temp = Files.createTempDirectory(path, "DIR_");
        Files.createTempFile(temp, "pre", ".non");
        Files.newDirectoryStream(path).forEach(System.out::println);
        System.out.println("**************");
        Files.walk(path).forEach(System.out::println);
    }

    static void populateTestDir() throws IOException {
        for (int i = 0; i < parts.size(); i++) {
            Path variant = makeVariant();
            if (!Files.exists(variant)) {
                Files.createDirectories(variant);
                Files.copy(Paths.get("src/main/java/com/dave/java/files/RmDir.java"), variant.resolve("File.txt"));
                Files.createTempFile(variant, null, null);
            }
        }
    }
}
