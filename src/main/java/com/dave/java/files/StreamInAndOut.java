package com.dave.java.files;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamInAndOut {
    public static void main(String[] args) {
        try (
                //输入
           Stream<String> in = Files.lines(Paths.get("src/main/java/com/dave/java/files/StreamInAndOut.java"));
           //输出
           PrintWriter out = new PrintWriter("StreamInAndOut.txt")) {
            in.map(String::toUpperCase)
                    .forEachOrdered(out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
