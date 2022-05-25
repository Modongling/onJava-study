package com.dave.java.collections;

import com.dave.java.reflection.pets.Pet;
import com.dave.java.reflection.pets.PetCreator;

import java.util.Iterator;
import java.util.List;

public class SimpleIterator {
    public static void main(String[] args) {
        List<Pet> pets = new PetCreator().list(12);
        Iterator<Pet> it = pets.iterator();
        while(it.hasNext()) {
            Pet pet = it.next();
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();
        for (Pet pet : pets) {
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();
        it = pets.iterator();
        for (int i = 0; i < 6; i++) {
            //取到当前元素，指向下一个元素
            it.next();
            //迭代器删除next产生的最后一个元素
            it.remove();
        }
        System.out.println(pets);
    }
}
