package com.dave.java.collections;

import com.dave.java.reflection.pets.Hamster;
import com.dave.java.reflection.pets.Pet;
import com.dave.java.reflection.pets.PetCreator;
import com.dave.java.reflection.pets.Rat;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(new PetCreator().list(5));
        System.out.println(pets);
        //NSE
        System.out.println("getFirst():" + pets.getFirst());
        System.out.println("element():" + pets.element());
        //null正常返回
        System.out.println("peek():" + pets.peek());
        //移除并返回第一个元素NSE
        System.out.println("remove():" + pets.remove());
        System.out.println("removeFirst():" + pets.removeFirst());
        //null
        System.out.println("poll():" + pets.poll());
        System.out.println(pets);
        pets.addFirst(new Rat());
        System.out.println("After addFirst():" + pets);
        pets.offer(new PetCreator().get());
        System.out.println("After offer():" + pets);
        pets.addLast(new Hamster());
        System.out.println("After addLast():" + pets);
        //移除并返回最后一个元素
        System.out.println("removeLast():" + pets.removeLast());
    }
}
