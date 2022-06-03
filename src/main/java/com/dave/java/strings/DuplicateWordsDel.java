package com.dave.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 元字符
 *  特殊字符
 *   . 任意字符（不包含换行）
 *   \d 任意数字 \D任意非数字
 *   \w 任意数字字母下划线 \W 任意非数字字母下划线
 *   \s 任意空白符 \S 任意非空白符
 *  空白符
 *   \r 回车
 *   \n(\r\n) 换行
 *   \f 换页
 *   \t 制表
 *   \v 垂直制表符
 *   \s 任意空白符
 *  范围
 *   ｜或 ab｜bc
 *   [...]多选一，括号中的任意一个元素
 *   [a-z]匹配任意范围内的任意一个元素
 *   [^...]，取反，不包含括号中的任意单个元素
 *   ^ 起始符
 *   $ 结束符
 *  量词
 *   * >= 0
 *   + >= 1
 *   ? (0/1)
 *   {m} m次
 *   {m,} >=m
 *   {m,n} m <= x <= n
 *  断言
 *   单词边界 \b\w+\b
 *   行的开始/结束
 *   环视 前后均满足条件，或者都不满足
 *
 *  ----------------------------------------
 *  1[3-9]\d{9}
 */
public class DuplicateWordsDel {
    public static void main(String[] args) {
        String test = "the little cat cat in the hat hat.";
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(test);
        while (matcher.find()) {
            System.out.println(test.replaceAll(matcher.group(), matcher.group(1)));
        }
    }
}
