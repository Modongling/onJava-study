package com.dave.java.reuse;

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind wind = new Wind();
        //子类是父类的衍生，这一点语言支持，向上转型
        Instrument.tune(wind);
    }
}
class Instrument {
    public void play() {}
    static void tune(Instrument instrument) {
        instrument.play();
    }
}
