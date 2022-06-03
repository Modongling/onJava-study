package com.dave.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 零宽断言
 * 肯定逆序环视
 * (?<=Y) 左边是Y (?<=\d)th --> 9th
 * 否定逆序环视
 * (?<!Y) 左边不是Y (?<!\d)th --> health
 * 肯定顺序环视
 * (?=y) 右边是Y six(?=\d) --> six6
 * 否定顺序环视
 * (?!Y) 右边不是Y hi(?!\d) --> high
 *
 * 左尖括号代表看左边，没有尖括号是看右边，感叹号是非的意思
 *
 * 单词边界环视
 *
 * 环视中的括号不能保存分组，保存成子组的一般是匹配文本内容，后续做替换或者其他操作
 * 环视括号内的文本，只匹配环视中的位置，不匹配文本内容
 *
 */
public class Around {
    public static void main(String[] args) {
        String test = "130400";
        String regex = "(?<!\\d)\\d{6}(?!\\d)";
        Matcher matcher = Pattern.compile(regex).matcher(test);
        System.out.println(matcher.find());
        //(?<!\w)\w+(?!\w)
        //(?<=\W)\w+(?=\W) 不能匹配首尾
        String line = "the little cat in the hat";
        String lineRegex = "(?<=\\W)\\w+(?=\\W)";
        Matcher lineMatcher = Pattern.compile(lineRegex).matcher(line);
        System.out.println(lineMatcher.find());

        String line2 = "the little cat cat2 in the hat hat2, we like it";
        //边界+单词子组+空格
        String regex2 = "\\b(\\w+)\\s\\1\\b";
        Matcher matcher2 = Pattern.compile(regex2).matcher(line2);
        System.out.println(matcher2.find());


    }
}
