package com.dave.java.initandgc;

import com.dave.java.utils.Nap;

/**
 * 垃圾回收仅和内存有关 --GC回收器
 * 非常规Java模式创建的对象需要通过finalize()回收，例如通过C调用native method创建对象
 */
public class TerminationCondition {
    public static void main(String[] args) {
        Book book = new Book(true);
        book.checkIn();
        new Book(true);
        System.gc();
        new Nap(1);
    }
}

class Book {
    boolean checkOut = false;
    Book(boolean checkOut) {
        this.checkOut = checkOut;
    }

    void checkIn() {
        checkOut = false;
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() throws Throwable {
        if (checkOut) {
            System.out.println("Error: check out");
            super.finalize();
        }
    }

}
