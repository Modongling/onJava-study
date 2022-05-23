package com.dave.java.interfaces.abs;

public class MusicImplAbs {
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

/**
 * 抽象类更像是模板方法的base
 */
abstract class Instrument {
    private int i;
    public abstract void play(Note note);
    public String what() {
        return "Instrument";
    }
    public abstract void adjust();
}

class Wind extends Instrument {

    @Override
    public void play(Note note) {
        System.out.println("Wind.play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjust wind");
    }

    @Override
    public String what() {
        return "Wind";
    }
}

class Percussion extends Instrument {

    @Override
    public void play(Note note) {
        System.out.println("Percussion.play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjust percussion");
    }

    @Override
    public String what() {
        return "Percussion";
    }
}

class Stringed extends Instrument {

    @Override
    public void play(Note note) {
        System.out.println("Stringed.play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjust Stringed");
    }

    @Override
    public String what() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Brass.play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjust Brass");
    }
}

class WoodWind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("WoodWind.play() " + note);
    }

    @Override
    public String what() {
        return "WoodWind";
    }
}

