package com.dave.java.exceptions;

/**
 * 自动关闭
 */
public class AutoCloseableDetail {
    public static void main(String[] args) {
        try (First first = new First();
             Second second = new Second()) {

        }
    }
}

class Reporter implements AutoCloseable {
    String name = getClass().getSimpleName();

    public Reporter() {
        System.out.println("Reporter creating:" + name);
    }

    /**
     * try-with-resources:代码执行完成之后会执行各自的close方法
     */
    @Override
    public void close() {
        System.out.println("Closing:" + name);
    }

}

class First extends Reporter {
}

class Second extends Reporter {
}
