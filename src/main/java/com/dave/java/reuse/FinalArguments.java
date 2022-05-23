package com.dave.java.reuse;

public class FinalArguments {
    void f1(Gizmo gizmo){}
    //对象不可变
    void f2(final Gizmo gizmo){}
    //final局部变量只能读取一次
    int f3(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments finalArguments = new FinalArguments();
        finalArguments.f1(null);
        finalArguments.f2(null);
        System.out.println(finalArguments.f3(2));
    }
}
class Gizmo {
    public void spin() {}
}