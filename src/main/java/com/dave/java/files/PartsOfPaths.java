package com.dave.java.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PartsOfPaths {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        Path p = Paths.get("src/main/java/com/dave/java/files/PartsOfPaths.java").toAbsolutePath();
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(p.getName(i));
        }
        System.out.println("end with .java " + p.endsWith(".java"));
        //Path路径迭代
        for (Path path : p) {
            System.out.print(path + ":");
            System.out.print(p.startsWith(path) + ":");
            System.out.println(p.endsWith(path));
        }
        System.out.println("Starts with " + p.getRoot() + " " + p.startsWith(p.getRoot()));
    }
}
