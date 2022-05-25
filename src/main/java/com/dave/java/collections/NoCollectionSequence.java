package com.dave.java.collections;

import com.dave.java.reflection.pets.Pet;
import com.dave.java.reflection.pets.PetCreator;

import java.util.Iterator;

public class NoCollectionSequence extends PetSequence {
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

    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        NoCollectionSequence sequence = new NoCollectionSequence();
        InterfaceVsIterator.display(sequence.iterator());
    }
}

class PetSequence {
    protected Pet[] pets = new PetCreator().array(8);
}
