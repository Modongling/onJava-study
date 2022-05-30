package com.dave.java.strings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 二进制转十六进制文件
 */
public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0) {
                result.append(String.format("%05X: ", n));
            }
            result.append(String.format("%02X ", b));
            n++;
            if (n % 16 == 0) {
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println(format(Files.readAllBytes(Paths.get("src/main/java/com/dave/java/strings/Hex.java"))));
        } else {
            System.out.println(format(Files.readAllBytes(Paths.get(args[0]))));
        }
    }
}
