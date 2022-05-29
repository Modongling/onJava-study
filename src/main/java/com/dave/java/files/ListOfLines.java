package com.dave.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 小文件读写
 */
public class ListOfLines {
    public static void main(String[] args) throws IOException {
        Files.readAllLines(Paths.get("test"))
                .stream()
                .filter(line -> !line.startsWith("//"))
                .map(line -> line.substring(0, line.length() / 2))
                .forEach(System.out::println);
    }
}
