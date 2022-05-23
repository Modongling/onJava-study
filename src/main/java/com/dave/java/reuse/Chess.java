package com.dave.java.reuse;

/**
 * super关键字
 * 调用父类构造器，或者父类的方法，或者非private的成员变量
 * 尤其在父类没有默认构造器时，必须显式在子类中调用父类的有参构造器
 */
public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess Constructor");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
class BoardGame extends Game {

    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame Constructor");
    }
}
class Game {
    Game(int i) {
        System.out.println("Game Constructor");
    }
}