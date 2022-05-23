package com.dave.java.newfeature;

public class PermittedSubclasses {
    public static void main(String[] args) {
        //关于封闭类的其中一个反射API
        for (var p : Color.class.getPermittedSubclasses()) {
            System.out.println(p.getSimpleName());
        }
    }
}

sealed class Color permits Red, Green, Blue {}
final class Red extends Color {}
final class Green extends Color {}
final class Blue extends Color {}
