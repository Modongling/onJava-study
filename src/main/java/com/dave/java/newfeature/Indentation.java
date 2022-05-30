package com.dave.java.newfeature;

public class Indentation {
    public static final String NONE = """
            XXX
            YYY
            """;
    public static final String TWO = """
              XXX
              YYY
            """;
    public static final String EIGHT = """
                    XXX
                    YYY
            """;

    public static void main(String[] args) {
        System.out.println(NONE);
        System.out.println(TWO);
        System.out.println(EIGHT);
    }
}
