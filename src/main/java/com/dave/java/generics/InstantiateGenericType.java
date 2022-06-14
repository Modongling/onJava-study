package com.dave.java.generics;

import java.util.function.Supplier;

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe =
                new ClassAsFactory<>(Employee.class);
        System.out.println(fe.get());
        ClassAsFactory<Integer> fi =
                new ClassAsFactory<>(Integer.class);
        try {
            System.out.println(fi.get());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class ClassAsFactory<T> implements Supplier<T> {
    //Class作为工厂对象
    Class<T> kind;
    ClassAsFactory(Class<T> kind) {
        this.kind = kind;
    }
    @Override public T get() {
        try {
            //通过无参构造函数初始化对象
            return kind.getConstructor().newInstance();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {
    public Employee() {}
    @Override public String toString() {
        return "Employee";
    }
}
