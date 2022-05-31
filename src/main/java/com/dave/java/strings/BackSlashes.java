package com.dave.java.strings;

/**
 * 正则：1.数据有效性校验
 *      2.符合要求的文本内容，查找符合某个规则的文本
 *      3.文本切割，替换操作
 *
 *
 */
public class BackSlashes {
    public static void main(String[] args) {
        String one = "\\";
        String two = "\\\\";
        String three = "\\\\\\";
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(one.matches("\\\\"));
        System.out.println(two.matches("\\\\\\\\"));
        System.out.println(three.matches("\\\\\\\\\\\\"));
    }

}
