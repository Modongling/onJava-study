package com.dave.java.operation;

public class StringOperation {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z";
        System.out.println(s + x + y + z);
        System.out.println(x + " " + s);
        System.out.println(s + (x + y + z));
        //Integer.toString()
        System.out.println("" + x);
    }
}
