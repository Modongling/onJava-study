package com.dave.java.reuse;

public class SpaceShipDelegation {
    private String name;
    /**
     * 委托模式和组合最大的区别在于委托将被委托的类的所有方法暴露出来
     * 组合只是基于组合类本身增加新的功能
     */
    private SpaceShipControls spaceShipControls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    public void back(int velocity) {
        spaceShipControls.back(velocity);
    }
    public void up(int velocity) {
        spaceShipControls.up(velocity);
    }

    public void left(int velocity) {
        spaceShipControls.left(velocity);
    }

    public void right(int velocity) {
        spaceShipControls.right(velocity);
    }

    public void forward(int velocity) {
        spaceShipControls.forward(velocity);
    }
    public void turboBoost() {
        spaceShipControls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation spaceShipDelegation = new SpaceShipDelegation("NSEA Protector");
        spaceShipDelegation.forward(100);
    }
}
