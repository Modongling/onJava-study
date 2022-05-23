package com.dave.java.innerclazz;

public class InheritInner extends Winner.Inner {
    InheritInner(Winner winner) {
        //继承某个类的内部类Outer.super(),不继承外部类
        winner.super();
    }

    public static void main(String[] args) {
        Winner winner = new Winner();
        InheritInner inner = new InheritInner(winner);
    }
}

class Winner {
    class Inner {}
}
