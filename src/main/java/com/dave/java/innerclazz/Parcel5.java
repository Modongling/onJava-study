package com.dave.java.innerclazz;

public class Parcel5 {
    public Destination destination(String s) {
        /**
         * 局部内部类
         */
        final class PDestination2 implements Destination {
            private String label;

            public PDestination2(String label) {
                this.label = label;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination2(s);
    }

    public static void main(String[] args) {
        Parcel5 parcel5 = new Parcel5();
        Destination destination = parcel5.destination("Tasmania");
    }

}
