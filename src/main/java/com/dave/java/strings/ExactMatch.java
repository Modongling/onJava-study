package com.dave.java.strings;

public class ExactMatch {
    public static void main(String[] args) {
        String test = "tom asked me if I would go fishing with him tomorrow";
        String regex = "\\btom\\b";
        System.out.println(test.replaceAll(regex, "jerry"));
    }
}
