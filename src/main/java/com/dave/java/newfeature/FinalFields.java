package com.dave.java.newfeature;

public record FinalFields(int i) {
    int timesTen() {
        //传入的也是一个final常量,方法内的局部变量
        return i * 10;
    }
}

interface Star {
    double brightness();
    double density();
}

/**
 * 参数同名方法，在实现接口时不强制要求实现同名接口，或者说已经隐式添加了
 * @param brightness
 */
record ReadDwarf(double brightness) implements Star {

    @Override
    public double density() {
        return 100.0;
    }
}

/**
 * 隐式静态的
 */
class NestedRecords {
    record Nested(String s) {}
    void method() {
        record Local(String s) {}
    }
}

record Point(int x, int y) {
    void assertPositive(int val) {
        if (val < 0) {
            throw new IllegalArgumentException("negative");
        }
    }

    /**
     * 参数校验，紧凑构造器
     * @param x
     * @param y
     */
    Point {
        assertPositive(x);
        assertPositive(y);
    }
}


record PlusTen(int x) {
    PlusTen {
        //修改字段的初始值
        x += 10;
    }

    public static void main(String[] args) {
        System.out.println(new PlusTen(10));
    }
}

record Value(int x) {
    //使用普通构造器是需要显式初始化
    Value(int x) {
        this.x = x;
    }
}


