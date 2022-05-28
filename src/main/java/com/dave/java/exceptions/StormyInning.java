package com.dave.java.exceptions;


public class StormyInning extends Inning implements Storm {
    /**
     * 新异常和父类异常，但是不能捕获父类异常
     * @throws RainedOut
     * @throws BaseballException
     */
    public StormyInning() throws RainedOut, BaseballException{}
    public StormyInning(String s) throws BaseballException {}

    /**
     * 自行声明基类中不存在的异常
     * @throws RainedOut
     */
    @Override
    public void rainHard() throws RainedOut {}

    /**
     * 基类中重写的方法，抛出的异常应该小于等于基类，或者不抛出
     */
    @Override
    public void event() {}

    /**
     * 抛出基类异常的子类型
     * @throws PopFoul
     */
    @Override
    public void atBat() throws PopFoul {
    }

    public static void main(String[] args) {
        try {
            StormyInning stormyInning = new StormyInning();
            stormyInning.atBat();
        } catch (PopFoul e) {
            System.out.println("pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained Out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        try {
            Inning i = new StormyInning();
            //抽象类向上转型时，需要显式catch所有的抛出异常类型
            i.atBat();
        } catch (Strike e) {
            System.out.println("strike");
        } catch (Foul e) {
            System.out.println("foul");
        } catch (RainedOut e) {
            System.out.println("Rained Out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    Inning() throws BaseballException {}
    public void event() throws BaseballException {}
    public abstract void atBat() throws Foul, Strike;
    public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}


