package com.dave.java.files;

import java.io.IOException;
import java.nio.file.*;

public class Find {
    public static void main(String[] args) throws IOException {
        Path test = Paths.get("test");
        Directories.refreshTestDir();
        Directories.populateTestDir();
        Files.createDirectory(test.resolve("dir.tmp"));

        //glob表达式
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*.{tmp,txt}");
        Files.walk(test)
                .filter(matcher::matches)
                .forEach(System.out::println);
        System.out.println("*****************");

        PathMatcher matcher2 = FileSystems.getDefault().getPathMatcher("glob:*.tmp");
        Files.walk(test)
                .map(Path::getFileName)
                .filter(matcher2::matches)
                .forEach(System.out::println);
        System.out.println("*****************");

        Files.walk(test)
                .filter(Files::isRegularFile)
                .map(Path::getFileName)
                .filter(matcher2::matches)
                .forEach(System.out::println);
    }
}
