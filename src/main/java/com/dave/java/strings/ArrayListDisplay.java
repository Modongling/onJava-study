package com.dave.java.strings;

import com.dave.java.generics.coffee.Coffee;
import com.dave.java.generics.coffee.CoffeeSupplier;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListDisplay {
    public static void main(String[] args) {
        List<Coffee> coffees = Stream.generate(new CoffeeSupplier())
                .limit(10)
                .collect(Collectors.toList());
        //所谓的无意识递归指的是从容器到重写的方法一并执行
        System.out.println(coffees);
    }
}
