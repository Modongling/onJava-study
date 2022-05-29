package com.dave.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadLineStream {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("src/main/java/com/dave/java/files/ReadLineStream.java"))
                .skip(13)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
