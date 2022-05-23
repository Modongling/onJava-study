package com.dave.java.operation;

/**
 * 1.单一下划线<br/>
 * 2.数字的开头和结尾不能有下划线<br/>
 * 3.类型结尾符周围不能有下划线<br/>
 * 4.b,x等二进制/十六进制周围不能有下划线
 */
public class Underscores {
    public static void main(String[] args) {
        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0100_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        //十六进制换行
        System.out.printf("%x%n", bin);
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);
    }
}
