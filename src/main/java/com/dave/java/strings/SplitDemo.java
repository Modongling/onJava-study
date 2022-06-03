package com.dave.java.strings;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        String input =
                "This!!unusual use!!of exclamation!!points";
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input)));
        // 只执行前3次：
        System.out.println(Arrays.toString(
                Pattern.compile("!!").split(input, 3)));
    }
}
