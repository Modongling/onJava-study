package com.dave.java.reuse;

/**
 * 成员对象放在正在构建的类中，
 * 并且在新类中公开成员对象的所有方法
 */
public class SpaceShipControls {
    void up(int velocity){}
    void down(int velocity){}
    void left(int velocity){}
    void right(int velocity){}
    void forward(int velocity){}
    void back(int velocity){}
    void turboBoost(){}
}
