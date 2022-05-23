package com.dave.java.innerclazz;

public class Parcel7 {
    public Contents contents() {
        /**
         * 匿名内部类，没有className的类
         */
        return new Contents() {
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents contents = parcel7.contents();
    }
}
