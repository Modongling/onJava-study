package com.dave.java.reuse;

/**
 * 编译器初始化原则:
 * 1.定义对象时，在构造器调用前被初始化
 * 2.在该类的构造器中被初始化
 * 3.在实际使用时进行初始化
 * 4.实例初始化
 */
public class SprinklerSystem {
    private String value1, value2, value3, value4;
    /**组合**/
    private WaterSource waterSource = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "value1='" + value1 + '\'' +
                ", value2='" + value2 + '\'' +
                ", value3='" + value3 + '\'' +
                ", value4='" + value4 + '\'' +
                ", waterSource=" + waterSource +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public static void main(String[] args) {
        SprinklerSystem system = new SprinklerSystem();
        System.out.println(system);
    }
}
class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructor";
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "s='" + s + '\'' +
                '}';
    }
}
