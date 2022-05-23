package com.dave.java.interfaces;

public class MetalWork {
    public static void main(String[] args) {
        //匿名函数
        Operation operation = new Operation() {
            @Override
            public void execute() {
                Operation.show("operation");
            }
        };
        Operation.runOps(new Heart(), new Operation() {
            @Override
            public void execute() {
                Operation.show("Hammer");
            }
        },
                operation::execute/*方法引用*/,
                () -> Operation.show("Anneal")/*lambda*/);
    }
}
class Heart implements Operation {
    @Override
    public void execute() {
        Operation.show("heart");
    }
}
interface Operation {
    void execute();
    static void runOps(Operation... operations) {
        for (Operation op : operations) {
            op.execute();
        }
    }
    static void show(String msg) {
        System.out.println(msg);
    }
}
