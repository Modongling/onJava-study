package com.dave.java.initandgc;

public class Overloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("overload");
        }
    }
}

class Tree {
    int height;
    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    /**
     * 构造方法重载
     * @param initHeight
     */
    Tree(int initHeight) {
        height = initHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }

    /**
     * 方法重载
     * 在同一个类中，方法名一致，方法签名不同【参数列表】，不能通过返回值判定方法重载
     * 注:当参数列表是基本类型时，如果传入的值的类型小于方法参数类型，类型会自动提升
     * 如果传入的类型大于当前方法参数类型这需要显式向下强转
     */
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + "Tree is " + height + " feet tall");
    }
}
