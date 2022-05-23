package com.dave.java.reuse;

/**
 * 创建与销毁顺序
 */
public class CADSystem extends Shape {
    private Circle circle;
    private Triangle triangle;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for (int j = 0; j < lines.length; j++) {
            lines[j] = new Line(j, j * j);
        }
            circle = new Circle(1);
            triangle = new Triangle(1);
            System.out.println("Combined Constructor");
        }

    @Override
    void dispose() {
        triangle.dispose();
        circle.dispose();
        for (int i = lines.length - 1; i >= 0 ; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem cadSystem = new CADSystem(47);
        try {

        } finally {
            cadSystem.dispose();
        }
    }
}

class Shape {
    Shape(int i) {
        System.out.println("Shape Constructor");
    }
    void dispose() {
        System.out.println("Shape Dispose");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Drawing Circle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Drawing Triangle");
    }

    @Override
    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line start:" + start + ",end:" + end);
    }

    @Override
    void dispose() {
        System.out.println("Erasing Line start:" + start + ",end:" + end);
        super.dispose();
    }
}


