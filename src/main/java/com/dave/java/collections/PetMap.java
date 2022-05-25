package com.dave.java.collections;

import com.dave.java.reflection.pets.Cat;
import com.dave.java.reflection.pets.Dog;
import com.dave.java.reflection.pets.Hamster;
import com.dave.java.reflection.pets.Pet;

import java.util.HashMap;
import java.util.Map;

public class PetMap {
    public static void main(String[] args) {
        Map<String, Pet> map = new HashMap<>();
        map.put("My cat", new Cat("Molly"));
        map.put("My dog", new Dog("Ginger"));
        map.put("My Hamster", new Hamster("Bosco"));
        System.out.println(map);
        Pet dog = map.get("My dog");
        System.out.println(dog);
        System.out.println(map.containsKey("My dog"));
        System.out.println(map.containsValue(dog));
    }
}
