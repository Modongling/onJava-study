package com.dave.java.newfeature;

import java.util.Map;

public class BasicRecord {
    public static void main(String[] args) {
        var bob = new EmployeeRecord("Bob", 11);
        var dot = new EmployeeRecord("Dorothy Gale", 9);
        System.out.println(bob.name());
        System.out.println(bob.id());
        System.out.println(bob);
        var map = Map.of(bob, "A", dot, "B");
        System.out.println(map);
    }
}

/**
 * 隐式final
 * 包含一个AllArgs构造函数
 * 自动重写equal()/hashCode()/toString()
 * record隐含是一个final的类
 * @param name
 * @param id
 */
record EmployeeRecord(String name, int id) {}
