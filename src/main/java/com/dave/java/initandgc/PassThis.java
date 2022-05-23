package com.dave.java.initandgc;

public class PassThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
class Person {
    public void eat(Apple apple) {
        Apple peel = apple.getPeeled();
        System.out.println("Yummy");
    }
}
class Peeler {
    static Apple peel(Apple apple) {
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        //传递当前对象
        return Peeler.peel(this);
    }
}
