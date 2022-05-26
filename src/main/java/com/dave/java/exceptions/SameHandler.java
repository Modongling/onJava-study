package com.dave.java.exceptions;

public class SameHandler {
    void x() throws Except1, Except2, Except3, Expect4 {}
    void process() {}
    void f() {
        try {
            x();
        } catch (Expect4 e) {
            throw new RuntimeException(e);
        } catch (Except3 e) {
            throw new RuntimeException(e);
        } catch (Except1 e) {
            throw new RuntimeException(e);
        } catch (Except2 e) {
            throw new RuntimeException(e);
        }
    }
}
class EBase1 extends Exception {}
class Except1 extends EBase1 {}
class EBase2 extends Exception {}
class Except2 extends EBase2 {}
class EBase3 extends Exception {}
class Except3 extends EBase3 {}

class EBase4 extends Exception {}
class Expect4 extends EBase4 {}
