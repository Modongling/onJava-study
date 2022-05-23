package com.dave.java.controlflow;

public class ListCharacter {
    public static void main(String[] args) {
        for (char i = 0; i < 128 ; i++) {
            if (Character.isLowerCase(i)) {
                System.out.println("value: " + (int)i + " character: " + i);
            }
        }
    }
}
