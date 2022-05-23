package com.dave.java.innerclazz;

public class Parcel9 {
    public Destination destination(final String dest) {
        /**
         * 匿名内部类赋值的变量隐式的均为final
         */
        return new Destination() {
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel9 = new Parcel9();
        Destination destination = parcel9.destination("Tasmania");
    }
}
