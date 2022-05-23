package com.dave.java.polymorphism;

/**
 * 前期绑定：编译期确定调用方法相关的类型
 * 动态绑定：运行时基于对象类型确定方法对应的类型
 * static（类）或者final（阻止继承）方法会屏蔽这一机制，因为他们是确认的
 */
public class Music {
    public static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind wind = new Wind();
        //向上转型
        //在没有这种机制的情况下，每出现一种新类型就需要在定义一次方法相当冗余
        tune(wind);
    }
}
