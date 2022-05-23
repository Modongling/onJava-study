package com.dave.java.operation;

public class Literals {
    public static void main(String[] args) {
        //十六进制
        int i1 = 0x2f;
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F;
        System.out.println("i2: " + Integer.toBinaryString(i2));
        //八进制
        int i3 = 0177;
        System.out.println("i3: " + Integer.toBinaryString(i3));
        char c = 0xffff;
        System.out.println("c: " + Integer.toBinaryString(c));
        byte b = 0x7f;
        System.out.println("b: " + Integer.toBinaryString(b));
        short s = 0x7fff;
        System.out.println("s: " + Integer.toBinaryString(s));
        long n1 = 200L;
        byte blb = (byte) 0b00110101;
        System.out.println("blb: " + Integer.toBinaryString(blb));
        short bls = (short) 0B0010111110101111;
        System.out.println("bls: " + Integer.toBinaryString(bls));
        int bli = 0b00101111101011111010111110101111;
        System.out.println("bli: " + Integer.toBinaryString(bli));
        long bll = 0b00101111101011111010111110101111;
        System.out.println("bll: " + Long.toBinaryString(bll));
        float f = 1F;
        double d = 1D;

    }
}
