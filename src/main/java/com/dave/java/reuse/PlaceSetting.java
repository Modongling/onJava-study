package com.dave.java.reuse;

/**
 * 不需要引入新功能或者接口时优先考虑组合
 * 为了通过组合的方式把类的成员嵌入其他类中，嵌入类方法定义为public是一种委托的形式
 */
public class PlaceSetting extends Custom {
    private Spoon spoon;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dinnerPlate;

    public PlaceSetting(int i) {
        super(i + 1);
        spoon = new Spoon(i + 2);
        fork = new Fork(i + 3);
        knife = new Knife(i + 4);
        dinnerPlate = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting Constructor");
    }

    public static void main(String[] args) {
        PlaceSetting placeSetting = new PlaceSetting(0);
    }
}
class Custom {
    Custom(int i) {
        System.out.println("Custom Constructor");
    }
}
class Plate {
    Plate(int i) {
        System.out.println("Plate Constructor");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Utensil Constructor");
    }
}

class DinnerPlate extends Plate {

    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate Constructor");
    }
}

class Spoon extends Utensil {

    Spoon(int i) {
        super(i);
        System.out.println("Spoon Constructor");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Fork Constructor");
    }
}

class Knife extends Utensil {

    Knife(int i) {
        super(i);
        System.out.println("Knife Constructor");
    }
}

