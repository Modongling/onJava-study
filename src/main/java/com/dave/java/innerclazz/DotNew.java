package com.dave.java.innerclazz;

public class DotNew {
    public class Inner{}

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        //实例化内部类
        DotNew.Inner inner = dotNew.new Inner();
    }
}
