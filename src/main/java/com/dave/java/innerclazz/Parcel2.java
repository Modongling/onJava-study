package com.dave.java.innerclazz;

public class Parcel2 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String label) {
            this.label = label;
        }

        String readLabel() {
            return label;
        }
    }

    /**
     * 从外部到内部的入口，普通内部类和成员变量类似
     * @return
     */
    public Contents contents() {
        return new Contents();
    }

    public Destination destination(String dest) {
        return new Destination(dest);
    }

    public void ship(String dest) {
        Contents contents = contents();
        Destination destination = destination(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 parcel2 = new Parcel2();
        parcel2.ship("Tasmania");
        Parcel2 parcel22 = new Parcel2();
        Parcel2.Contents contents = parcel22.contents();
        Parcel2.Destination destination = parcel22.destination("Borneo");
    }
}
