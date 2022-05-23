package com.dave.java.reuse;

public class Orc extends  Villain {
    private int orcNumber;

    Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }

    public void change(String name, int orcNumber) {
        //调用protected方法，再没有同名函数时super省略
        setName(name);
        this.orcNumber = orcNumber;
    }

    @Override
    public String toString() {
        return "Orc{" +
                "orcNumber=" + orcNumber + " " + super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburge", 12);
        System.out.println(orc);
        orc.change("Bob", 19);
        System.out.println(orc);
    }
}

class Villain {
    private String name;

    protected void setName(String name) {
        this.name = name;
    }

    Villain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Villain{" +
                "name='" + name + '\'' +
                '}';
    }
}
