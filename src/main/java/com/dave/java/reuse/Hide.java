package com.dave.java.reuse;

public class Hide {
    public static void main(String[] args) {
        Bart bart = new Bart();
        bart.doh(1);
        bart.doh('x');
        bart.doh(1.0F);
        bart.doh(new Milhouse());
    }
}
class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float c) {
        System.out.println("doh(float)");
        return 1.0F;
    }
}

class Bart extends Homer {
    void doh(Milhouse m) {
        System.out.println("doh(Milhouse)");
    }
}

class Milhouse {}