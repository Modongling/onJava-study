package com.dave.java.interfaces;

import java.util.Arrays;
import java.util.Locale;

/**
 * 继承（协变）实现策略模式的思路
 * 参数比较固定的情况使用继承实现
 */
public class Applicator {
    public static void apply(Processor p, Object obj) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(obj));
    }

    /**
     * 接口方式
     * @param p
     * @param obj
     */
    public static void apply(com.dave.java.interfaces.strategyinter.Processor p, Object obj) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(obj));
    }

    public static void main(String[] args) {
        String s = "We are such stuff as dreams are made on";
        apply(new Upper(), s);
        apply(new Lower(), s);
        apply(new Splitter(), s);
    }

}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    public Object process(Object input) {
        return input;
    }
}

class Upper extends Processor {
    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase(Locale.ROOT);
    }
}

class Lower extends Processor {
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase(Locale.ROOT);
    }
}


class Splitter extends Processor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}