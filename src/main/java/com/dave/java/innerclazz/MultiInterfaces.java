package com.dave.java.innerclazz;

/**
 * 1.内部类可以有多个实例，并且有独立的状态信息，独立于外围对象
 * 2.外围类和累不累可以实现同一个接口，对应不同的业务处理逻辑，或者继承同一个类
 * 3.除嵌套类外，内部类不随外部类的创建捆绑
 * 4.内部类不包含is-a的关系，是独立实体
 */
public class MultiInterfaces {
    static void takeA(A a){}
    static void takeB(B b){}
    static void takeD(D d){}
    static void takeE(E e){}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takeA(x);
        takeB(x);
        takeA(y);
        takeB(y.makeB());
        Z z = new Z();
        takeD(z);
        takeE(z.makeE());

    }
}

interface A {}
interface B {}

class X implements A, B {}
//接口的情况下两种都适用
class Y implements A {
    B makeB() {
        return new B() {
        };
    }
}

class D {}
abstract class E {}
//继承类的时候，内部类可以解决多继承问题
class Z extends D {
    E makeE() {
        return new E() {
        };
    }
}