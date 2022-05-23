package com.dave.java.interfaces;

/**
 * 接口，向上转型为多个基类的灵活性，防止客户直接创建此类对象
 * 如果没有成员变量或者方法定义的情况下选择接口，某个类可以作为基类也可以设计为接口
 */
public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }
    public static void  u(CanSwim x) {
        x.swim();
    }
    public static void v(CanFly x) {
        x.fly();
    }
    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
    }
}

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}