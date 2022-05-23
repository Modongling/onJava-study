package com.dave.java.innerclazz;

public class ClosureTest {
    public static void main(String[] args) {
        Callee1 callee1 = new Callee1();
        Callee2 callee2 = new Callee2();
        //MyIncrement.f(callee2);
        Caller caller = new Caller(callee1);
        Caller caller2 = new Caller(callee2.getIcremetable());
        caller.go();
        caller2.go();
        caller2.go();
    }

}
interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement increment) {
        increment.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    //其他方式实现同名方法
    private class Closure implements Incrementable {
        @Override
        public void increment() {
            //指定外围方法
            Callee2.this.increment();
        }
    }

    //内部类回调
    Incrementable getIcremetable() {
        return new Closure();
    }
}

class Caller {
    private Incrementable incrementable;

    public Caller(Incrementable incrementable) {
        this.incrementable = incrementable;
    }
    void go() {
        incrementable.increment();
    }
}

