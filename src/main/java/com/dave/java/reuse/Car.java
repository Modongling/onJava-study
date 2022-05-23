package com.dave.java.reuse;

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door door1 = new Door(),
    door2 = new Door();

    public Car() {
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.door1.window.rollup();
        car.wheels[0].inflate(72);
    }
}

class Engine {
    public void start(){}
    public void stop(){}
    public void rev(){}
}

class Wheel {
    public void inflate(int psi){}
}

class Window {
    public void rollup(){}
    public void rolldown(){}
}

class Door {
    public Window window = new Window();
    public void open(){}
    public void close(){}
}

