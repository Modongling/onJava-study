package com.dave.java.strings;

import java.util.Arrays;

public class Splitting {
    public static String knights = "Then, when you found the shrubbery, you must cut down yhe mightiest tree in the " +
    "forest...with... a herring!";
    public static void split(String regex) {
        System.out.println(Arrays.asList(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        //n+不是数字字母下划线的字符
        split("n\\W+");
    }
}
