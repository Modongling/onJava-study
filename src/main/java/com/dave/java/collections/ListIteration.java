package com.dave.java.collections;

import com.dave.java.reflection.pets.Pet;
import com.dave.java.reflection.pets.PetCreator;

import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets = new PetCreator().list(8);
        //List接口下的迭代器
        ListIterator<Pet> iterator = pets.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", " + iterator.nextIndex() + ", " + iterator.previousIndex() + "; ");
        }
        System.out.println();
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous().id() + " ");
        }
        System.out.println();
        System.out.println(pets);
        //从指定位置遍历
        iterator = pets.listIterator(3);
        while (iterator.hasNext()) {
            iterator.next();
            //迭代并替换元素
            iterator.set(new PetCreator().get());
        }
        System.out.println(pets);
    }
}
