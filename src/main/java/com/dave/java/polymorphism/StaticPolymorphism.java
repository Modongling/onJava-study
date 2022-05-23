package com.dave.java.polymorphism;

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper staticSuper = new StaticSub();
        System.out.println(staticSuper.get());
        //静态域或者方法不存在多态
        System.out.println(StaticSuper.staticGet());
        System.out.println(StaticSub.staticGet());
    }
}
class StaticSuper {
    public static String staticGet() {
        return "Super static";
    }

    public String get() {
        return "Super";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Sub static";
    }

    @Override
    public String get() {
        return "Sub";
    }
}
