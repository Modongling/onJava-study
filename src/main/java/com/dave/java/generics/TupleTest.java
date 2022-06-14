package com.dave.java.generics;

import com.dave.java.utils.Tuple2;
import com.dave.java.utils.Tuple3;
import com.dave.java.utils.Tuple4;
import com.dave.java.utils.Tuple5;

public class TupleTest {
    static Tuple2<String, Integer> f() {
        return new Tuple2<>("hi", 47);
    }

    static Tuple3<Amphibian, String, Integer> g() {
        return new Tuple3<>(new Amphibian(), "hI", 47);
    }

    static Tuple4<Vehicle, Amphibian, String, Integer> h() {
        return new Tuple4<>(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static Tuple5<Vehicle, Amphibian, String, Integer, Double> k() {
        return new Tuple5<>(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    public static void main(String[] args) {
        Tuple2<String, Integer> tuple2 = f();
        System.out.println(tuple2);
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}