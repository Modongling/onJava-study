package com.dave.java.operation;

public class EqualMethod {
    public static void main(String[] args) {
        ValA val1 = new ValA();
        ValA val2 = new ValA();
        val1.i = val2.i = 100;
        //默认判定不是同一个对象
        System.out.println(val1.equals(val2));
        ValB val3 = new ValB();
        ValB val4 = new ValB();
        //重写后只比较值
        System.out.println(val3.equals(val4));
    }
}
class ValA {
    int i;
}
class ValB {
    int i;
    @Override
    public boolean equals(Object o) {
        ValB rval = (ValB) o;
        return i == rval.i;
    }
}