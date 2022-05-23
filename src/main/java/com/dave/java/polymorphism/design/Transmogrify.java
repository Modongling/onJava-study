package com.dave.java.polymorphism.design;

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    @Override
    public void act() {
        System.out.println("Happy actor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("Sad actor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    /**
     * 状态模式 --- 继承
     */
    public void change() {
        actor = new SadActor();
    }
    public void performPlay() {
        actor.act();
    }
}

