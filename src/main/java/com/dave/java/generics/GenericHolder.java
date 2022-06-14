package com.dave.java.generics;

public class GenericHolder<T> {
    private T a;

    public GenericHolder() {
    }

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        GenericHolder<Automobile> holder = new GenericHolder<>();
        //泛型，编译期检查
        holder.set(new Automobile());
        Automobile a = holder.get();
    }
}
