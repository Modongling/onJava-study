package com.dave.java.polymorphism;

public class Wind extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Wind play():" + note);
    }
}

class Instrument {
    public void play(Note note) {
        System.out.println("Instrument play()");
    }
}

enum Note {
    MIDDLE_C, SHARP, B_FLAT
}