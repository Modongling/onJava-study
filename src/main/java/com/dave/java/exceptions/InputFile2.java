package com.dave.java.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class InputFile2 {
    private String name;
    public InputFile2(String name) {
        this.name = name;
    }

    public Stream<String> getLines() throws IOException {
        return Files.lines(Paths.get(name));
    }

    public static void main(String[] args) throws IOException {
        new InputFile2("src/main/java/com/dave/java/exceptions/InputFile2.java").getLines()
                .skip(15)
                .limit(1)
                .forEach(System.out::println);
    }
}
