package com.dave.java.exceptions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Closeable --- AutoCloseable
 */
public class StreamsAreAutoCloseable {
    public static void main(String[] args) throws IOException {
        try (Stream<String> in = Files.lines(Paths.get("src/main/java/com/dave/java/exceptions/StreamsAreAutoCloseable.java"));
             PrintWriter writer = new PrintWriter("result.txt")) {
            in.skip(5)
                    .limit(1)
                    .map(String::toLowerCase)
                    .forEach(writer::println);
        }
    }
}
