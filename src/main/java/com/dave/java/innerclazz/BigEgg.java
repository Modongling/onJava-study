package com.dave.java.innerclazz;

public class BigEgg extends Egg {
    public BigEgg() {
        insertYolk(new Yolk());
    }

    public class Yolk extends Egg.Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
        public void f() {
            System.out.println("BigEgg.Yolk.f()");
        }
    }

    public static void main(String[] args) {
        Egg egg = new BigEgg();
        egg.g();
    }
}

class Egg {
    private Yolk yolk = new Yolk();

    public Egg() {
        System.out.println("Egg()");
    }
    public void insertYolk(Yolk yolk) {
        yolk = yolk;
    }

    public void g() {
        yolk.f();
    }

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
        public void f() {
            System.out.println("Egg.Yolk.f()");
        }
    }
}
