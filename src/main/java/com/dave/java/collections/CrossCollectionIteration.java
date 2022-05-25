package com.dave.java.collections;

import com.dave.java.reflection.pets.Pet;
import com.dave.java.reflection.pets.PetCreator;

import java.util.*;

public class CrossCollectionIteration {
    public static void display(Iterator<Pet> iterator) {
        while(iterator.hasNext()) {
            Pet pet = iterator.next();
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> pets = new PetCreator().list(8);
        LinkedList<Pet> petLinkedList = new LinkedList<>(pets);
        HashSet<Pet> petHashSet = new HashSet<>(pets);
        TreeSet<Pet> petTreeSet = new TreeSet<>(pets);
        //Iterable接口
        display(pets.iterator());
        display(petLinkedList.iterator());
        display(petHashSet.iterator());
        display(petTreeSet.iterator());
    }
}
