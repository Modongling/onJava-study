package com.dave.java.exceptions;

/**
 *  异常匹配原则
 *  1.精确匹配
 *  2.匹配其父类型异常
 */
public class Human {
    public static void main(String[] args) {
        try {
            throw new Sneeze();
        } catch (Sneeze e) {
            System.out.println("Sneeze");
        } catch (Annoyance e) {
            System.out.println("Annoyance");
        }

        try {
            throw new Sneeze();
            //能捕获任意子类型
        }catch (Annoyance e) {
            System.out.println("Annoyance");
        }
    }
}

class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

