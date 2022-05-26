package com.dave.java.exceptions;

public class Switch {
    private boolean state = false;
    public boolean read() {
        return state;
    }
    public void on() {
        state = true;
        System.out.println(this);
    }
    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }
}

class OnOffException1 extends Exception {}
class OnOffException2 extends Exception {}

class OnOffSwitch {
    private static Switch aSwitch = new Switch();
    public static void f() throws OnOffException1, OnOffException2 {}

    public static void main(String[] args) {
        try {
            aSwitch.on();
            f();
            aSwitch.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            aSwitch.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            aSwitch.off();
        }
    }
}

class OnOffSwitchFinally {
    static Switch aSwitch = new Switch();
    public static void main(String[] args) {
        try {
            aSwitch.on();
            OnOffSwitch.f();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            aSwitch.off();
        }
    }

}
