package com.dave.java.innerclazz;

public interface ClassInterface {
    void howdy();

    /**
     * 接口中的类
     */
    class Test implements ClassInterface {

        @Override
        public void howdy() {
            System.out.println("Inner class interface");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
