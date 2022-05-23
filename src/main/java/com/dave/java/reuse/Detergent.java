package com.dave.java.reuse;

public class Detergent extends Cleaner{
    @Override
    public void scrub() {
        append("sub scrub()");
        super.scrub();
    }

    public void foam() {
        append("foam()");
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        System.out.println(args);
    }
}
class Cleaner {
    private String s = "Cleaner";
    public void append(String a) {
        s += a;
    }
    public void dilute() {
        append("dilute()");
    }
    public void apply() {
        append("apply()");
    }
    public void scrub() {
        append("scrub()");
    }

    @Override
    public String toString() {
        return "Cleaner{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner();
        cleaner.dilute();
        cleaner.apply();
        cleaner.scrub();
        System.out.println(cleaner);
    }
}