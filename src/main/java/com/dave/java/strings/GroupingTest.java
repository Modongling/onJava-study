package com.dave.java.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 分组-- () 一般情况下左分支优先
 * 多个元字符看成一个整体部分,默认括号内会保存子组
 * 15-18位数 \d{15}(\d{3})?
 * 日期 (\d{4}-\d{2}-\d{2}) (\d{2}:\d{2}:\d{2})
 * -------------------------------------------
 * 不保存子组的情况，?:
 * \d{15}(?:\d{3})? 整体化考虑，不保存子组，匹配18位
 * ?<GroupName> 命名分组 分组引用 \1(查找) $1(替换)
 */
public class GroupingTest {
    public static void main(String[] args) {
        String test = "2022-06-01 00:00:00";
        String regex = "((\\d{4})-(\\d{2})-(\\d{2})) ((\\d{2}):(\\d{2}):(\\d{2}))";
        String temp = "日期$1 时间$5   $2年$3月$4日 $6时$7分$8秒";
        Matcher matcher = Pattern.compile(regex)
                .matcher(test);
        System.out.println(matcher.replaceAll(temp));

        String test2 = "the little cat cat is in the hat hat hat, we like it.";
        //出现至少一次的单词+空格，\1查找前一个分组
        String regex2 = "(\\w+)(\\s+\\1)+";
        findSame(regex2, test2);
    }

    public static void findSame(String regex, String test) {
        Matcher matcher = Pattern.compile(regex,Pattern.MULTILINE)
                        .matcher(test);
        System.out.println(matcher.replaceAll("$1"));
    }
}

