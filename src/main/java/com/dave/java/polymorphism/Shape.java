package com.dave.java.polymorphism;

import java.util.Random;

public class Shape {
    public void draw() {}
    public void erase() {}

    /**
     * 扩展性增强
     * @return
     */
    public Shape get() {
        return switch (rand.nextInt(3)) {
            case 0 -> new Circle();
            case 1 -> new Square();
            case 2 -> new Triangle();
            default -> null;
        };
    }

    public Shape[] array(int size) {
        Shape[] shapes = new Shape[size];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = get();
        }
        return shapes;
    }

    private final Random rand = new Random(47);

    public static void main(String[] args) {
        Shape shape = new Shape();
        for (Shape s : shape.array(9)) {
            s.draw();
        }
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle erase()");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square erase()");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle erase()");
    }
}
