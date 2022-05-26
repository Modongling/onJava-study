package com.dave.java.exceptions;

public class MultiCatch {
    void x() throws Except1, Except2, Except3, Expect4 {}
    void process() {}
    void f() {
        try {
            x();
        } catch (Except1 | Except2 | Except3 | Expect4 e) {
            process();
        }
    }
}
