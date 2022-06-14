package com.dave.java.generics;

public class CreatorGeneric {
    public static void main(String[] args) {
        XCreator creator = new XCreator();
        creator.f();
    }
}
abstract class GenericWithCreate<T> {
    final T element;
    //模版方法父类初始化
    GenericWithCreate() { element = create(); }
    abstract T create();
}

class X {}

class XCreator extends GenericWithCreate<X> {
    @Override X create() { return new X(); }
    void f() {
        System.out.println(
                element.getClass().getSimpleName());
    }
}
