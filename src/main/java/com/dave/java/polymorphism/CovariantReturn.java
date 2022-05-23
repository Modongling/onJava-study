package com.dave.java.polymorphism;

/**
 * 向下转型一般情况下会报错ClassCastException
 * 一般通过反射确认在转型的类是否存在问题
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain grain = mill.process();
        System.out.println(grain);
        mill = new WheatMill();
        grain = mill.process();
        System.out.println(grain);
    }
}

class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    /**
     * 协变，重新返回父类方法的类型或者子类型
     * @return
     */
    @Override
    Wheat process() {
        return new Wheat();
    }
}
