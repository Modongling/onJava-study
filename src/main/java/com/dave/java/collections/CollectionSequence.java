package com.dave.java.collections;

import com.dave.java.reflection.pets.Pet;
import com.dave.java.reflection.pets.PetCreator;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection<Pet> {

    private Pet[] pets = new PetCreator().array(8);
    /**
     * 继承自顶层抽象类，由于没有内置迭代器实现所以需要实现迭代器
     * @return
     */
    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        CollectionSequence sequence = new CollectionSequence();
        InterfaceVsIterator.display(sequence);
        InterfaceVsIterator.display(sequence.iterator());
    }
}
