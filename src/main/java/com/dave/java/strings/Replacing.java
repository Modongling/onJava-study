package com.dave.java.strings;

public class Replacing {
    static String s = Splitting.knights;

    public static void main(String[] args) {
        //替换f打头的单词，为located，只替换第一次匹配的
        System.out.println(s.replaceFirst("f\\w+", "located"));
        //替换这几个单词为另一个单词
        System.out.println(s.replaceAll("Shrubbery|tree|herring", "banana"));
    }
}
