package com.dave.java.initandgc;

/**
 * 之前的可变参数，采用的是new Object[]动态数组的形式
 */
public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object o : args) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(47, (float) 3.14, 11.11);
        printArray(47, 3.14F, 11.11);
        printArray("one", "two", "three");
        printArray(new A(), new A(), new A());
        printArray((Object[])new Integer[]{1, 2, 3, 4});
        printArray();
    }
}
class A {}
