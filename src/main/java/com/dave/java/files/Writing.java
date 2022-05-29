package com.dave.java.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

/**
 * 字节数组和list写入文件
 */
public class Writing {
    static Random random = new Random(47);
    static final int SIZE = 1000;

    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[SIZE];
        random.nextBytes(bytes);
        Files.write(Paths.get("bytes.bat"), bytes);
        System.out.println("byte.dat:" + Files.size(Paths.get("bytes.dat")));

        List<String> lines = Files.readAllLines(Paths.get("test"));
        Files.write(Paths.get("Cheese.txt"), lines);
        System.out.println("cheese.txt:" + Files.size(Paths.get("cheese.txt")));
    }
}
