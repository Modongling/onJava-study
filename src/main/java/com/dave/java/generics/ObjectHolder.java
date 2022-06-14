package com.dave.java.generics;


public class ObjectHolder {
    private Object a;
    public ObjectHolder(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public static void main(String[] args) {
        ObjectHolder holder = new ObjectHolder(new Automobile());
        Automobile automobile = (Automobile) holder.get();
        holder.set("Not an Automobile");
        String s = (String) holder.get();
        holder.set(1);
        Integer x = (Integer) holder.get();
    }
}
