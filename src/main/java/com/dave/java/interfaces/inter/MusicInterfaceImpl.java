package com.dave.java.interfaces.inter;

/**
 * 接口和抽象类对比:
 * 1.继承和实现
 * 接口:实现多继承
 * 抽像类:单继承
 * 2.字段和状态
 * 接口:static+final常量，不支持对象状态
 * 抽象类:可以包含字段，抽象方法可以引用
 * 3.方法
 * 接口：默认方法不需要在实现类中实现，只能因引用接口方法，可以包含金泰方法
 * 抽象类:可以包含所有类型的，抽象方法必须在子类中实现
 * 4.构造函数
 * 抽象类:可以包含构造函数
 * 接口:不能包含构造函数
 * 5.访问权限
 * 接口:隐式public
 * 抽象类:所有访问权限都可包括，抽象方法可以是public/protected
 */
public class MusicInterfaceImpl {
    static void tune(Instrument instrument) {
        instrument.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument[] instruments) {
        for (Instrument i : instruments) {
            tune(i);
        }
    }
    public static void main(String[] args) {
        Instrument[] instruments = {new Wind(), new Percussion(), new Stringed(), new Brass(), new WoodWind()};
        tuneAll(instruments);
    }
}

enum Note {
    MIDDLE_C, SHARP, B_FLAT
}

interface Instrument {
    int VALUE = 5;
    default void play(Note note) {
        System.out.println(this + ".play()" + note);
    }

    default void adjust() {
        System.out.println("Adjusting " + this);
    }

}

class Wind implements Instrument {
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {
    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {
    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class WoodWind extends Wind {
    @Override
    public String toString() {
        return "WoodWind";
    }
}


