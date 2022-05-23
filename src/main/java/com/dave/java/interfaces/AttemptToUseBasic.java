package com.dave.java.interfaces;

public class AttemptToUseBasic extends Basic {
    @Override
    void unimplemented() {
        System.out.println("implement()");
    }

    public static void main(String[] args) {
        //通过实现类实例化，多态
        Basic basic = new AttemptToUseBasic();
        basic.unimplemented();
    }
}

/**
 * 抽象类,不能直接实例化
 * 抽象类中可以包含抽象方法
 * 可以包含任何访问权限的普通方法
 * 抽象类通常提供的是一个公共的模板
 */
abstract class Basic {
    abstract void unimplemented();
}
