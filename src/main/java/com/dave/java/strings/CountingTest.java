package com.dave.java.strings;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 贪婪模式 -- 默认， 尽可能最大长度匹配 a*
 * 非贪婪模式 -- a*? (x + ?) 尽可能短的匹配
 * 占有型 -- java (x + \\+) 尽可能对的去匹配匹配不上，匹配失败就结束
 */
public class CountingTest {
    public static void matcherTest(String regex, String test) {
        Matcher matcher = Pattern.compile(regex)
                .matcher(test);
        while (matcher.find()) {
            System.out.println(List.of(matcher.group()));
        }
    }
    public static void main(String[] args) {
        //贪婪模式优先匹配xyyy，z匹配不上，吐出z，用正则z进行匹配
        matcherTest("xy{1,3}z", "xyyz");
        System.out.println("-------------------");
        //xy xyy xyyz向前回溯匹配z
        matcherTest("xy{1,3}?z", "xyyz");
        System.out.println("-------------------");
        //xyyy匹配完成后不进行回溯，y不再有可以匹配的对象返回失败
        matcherTest("xy{1,3}+yz", "xyyz");
        System.out.println("-------------------");
        //字母数字下划线出现一次到多次，或"开始，非"出现一次到多次 "结束
        matcherTest("\\w+|“[^”]+”", "we found “the little cat” is in the hat, we like “the little cat");


    }
}
