package com.dave.java.polymorphism;

public class FieldAccess {
    public static void main(String[] args) {
        Super s = new Sub();
        //向上转型,当与父类属性同名时，默认是调用父类
        System.out.println(s.field);
        //默认调用重写后的方法
        System.out.println(s.getField());
        Sub sub = new Sub();
        //本类属性
        System.out.println(sub.field);
        //父类属性
        System.out.println(sub.getSuperField());
        //本类属性
        System.out.println(sub.getField());
    }
}

class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}
