package com.dave.java.utils;

import com.dave.java.generics.Amphibian;
import com.dave.java.generics.Vehicle;

import java.util.ArrayList;

public class TupleList <A, B, C, D> extends ArrayList<Tuple4<A, B, C, D>> {
    public static void main(String[] args) {
        TupleList<Vehicle, Amphibian, String, Integer> list = new TupleList<>();
        list.add(new Tuple4<>(new Vehicle(), new Amphibian(), "hi", 47));
        list.add(new Tuple4<>(new Vehicle(), new Amphibian(), "hi", 47));
        list.forEach(System.out::println);

    }
}
