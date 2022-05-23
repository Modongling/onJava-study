package com.dave.java.polymorphism;

public class Frog extends Amphibian {
    private Characteristic characteristic = new Characteristic("Croaks");
    private Description description = new Description("Eats Bugs");
    Frog() {
        System.out.println(" Frog()");
    }
    @Override
    protected  void dispose() {
        System.out.println("Frog dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.dispose();
    }
}

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Characteristic Constructor s:" + s);
    }

    protected void dispose() {
        System.out.println("Characteristic Dispose s:" + s);
    }
}


class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Description Constructor s:" + s);
    }

    protected void dispose() {
        System.out.println("Description Dispose s:" + s);
    }
}

class LivingCreature {
    private Characteristic characteristic = new Characteristic("is alive");
    private Description description = new Description("Basic Living Creature");
    LivingCreature() {
        System.out.println(" LivingCreature()");
    }
    protected  void dispose() {
        System.out.println("LivingCreature dispose");
        description.dispose();
        characteristic.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic characteristic = new Characteristic("has heart");
    private Description description = new Description("Animal not Vegetable");
    Animal() {
        System.out.println(" Animal()");
    }
    @Override
    protected  void dispose() {
        System.out.println("Animal dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic characteristic = new Characteristic("can live in water");
    private Description description = new Description("Both water and land");
    Amphibian() {
        System.out.println(" Amphibian()");
    }
    @Override
    protected  void dispose() {
        System.out.println("Amphibian dispose");
        description.dispose();
        characteristic.dispose();
        super.dispose();
    }
}