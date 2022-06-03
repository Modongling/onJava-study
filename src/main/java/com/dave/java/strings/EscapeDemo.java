package com.dave.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 转义 --- \
 * 1.access_log* 与 access_log\*
 * 2. "\""
 * 3.\\d \\|d [\d]
 * //// ---> \\ ---> \
 */
public class EscapeDemo {
    public static void main(String[] args) {
        String regex = "\\{1,3}\\[]\\(\\)";
        String test = "{1,3}[]()";
        Matcher matcher = Pattern.compile(regex).matcher(test);
        System.out.println(matcher.find());

        //字符串转义正则
        String  d = Pattern.quote("d");
        System.out.println(d);
        String test2 = "\\d";
        matcher = Pattern.compile(d).matcher(test2);
        System.out.println(matcher.find());

        //字符组转义,字符组起始位置转义
        matcher = Pattern.compile("[\\^ab]").matcher("^ab");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();

        //范围转义
        matcher = Pattern.compile("[a\\-c]").matcher("abc-");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();

        //右括号在括号中，且不在首位
        matcher = Pattern.compile("[a\\]b]").matcher("]ab");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
