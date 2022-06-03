package com.dave.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * \r\n - win
 * \n - linux
 * \n - mac
 */
public class LineStartEnd {
    public static void main(String[] args) {
        //\A,\z
        System.out.println(search("\\d{6}", "1234567"));
        System.out.println(search("^\\d{6}", "1234567"));
        System.out.println(search("\\d{6}$", "1234567"));
        System.out.println(search("^\\d{6}$", "1234567"));
        System.out.println(search("^\\d{6}$", "123456"));
    }

    public static Boolean search(String regex, String test) {
        Matcher matcher = Pattern.compile(regex)
                .matcher(test);
        return matcher.find();
    }
}
