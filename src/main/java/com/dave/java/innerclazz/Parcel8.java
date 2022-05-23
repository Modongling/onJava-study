package com.dave.java.innerclazz;

public class Parcel8 {
    public Wrapping wrapping(int x) {
        /**
         * 传入构造器参数
         */
        return new Wrapping(x) {
            @Override
            public int value() {
                //10
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8 = new Parcel8();
        Wrapping wrapping = parcel8.wrapping(10);
    }
}

class Wrapping {
    private int i;

    public Wrapping(int i) {
        this.i = i;
    }
    public int value() {
        return i;
    }
}