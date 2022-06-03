package com.dave.java.strings;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1.不区分大小写模式[Case-Insensitive] -- (?i) Pattern.CASE_INSENSITIVE(默认模式)
 * e.g. (?i)(cat) \1
 *      ((?i)cat) \1
 *      ((?i)the) cat
 * 2.点号通配模式[Dot All] -- ?s[single line] (.) -->[\d\D, \w\W, \s, \S]
 * e.g. (?s).+
 * 3.多行匹配模式[Multiline] --(?m)
 * e.g. (?m)^the|cat$
 * 4.注释模式[comment] -- ?#
 *
 * 综合
 * 单行不区分大小写，非贪婪，贪婪模式
 * (?si)<head/>.*<head/>
 *
 */
public class MatchMode {
    public static void main(String[] args) {
        //忽略大小写模式
        Matcher matcher = Pattern.compile("cat", Pattern.CASE_INSENSITIVE)
                .matcher("CAT Cat cat");
        while (matcher.find()) {
            System.out.println(List.of(matcher.group()));
        }

        //点号通配模式，任意字符一次到多次，single line
        Matcher dot = Pattern.compile(".+", Pattern.DOTALL)
                .matcher("The cat \n the cat");
        while (dot.find()) {
            System.out.println(List.of(dot.group()));
        }
        //多行模式
        Matcher muti = Pattern.compile("^the|cat$", Pattern.MULTILINE)
                .matcher("the little cat\nthe small cat");
        while (muti.find()) {
            System.out.println(List.of(muti.group()));
        }

        //注释模式，空白符忽略，#开头的的嵌入式注释会被忽略
        Matcher comment = Pattern.compile("(\\w+)#word", Pattern.COMMENTS)
                .matcher("CAT Cat cat");
        while (comment.find()) {
            System.out.println(List.of(comment.group()));
        }
    }
}
