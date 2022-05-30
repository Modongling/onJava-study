package com.dave.java.strings;

import java.util.Formatter;

/**
 * %d -- 整型
 * %c -- 字符
 * %b -- Boolean
 * %s -- 字符串
 * %f -- 浮点数
 * %e -- 浮点科学计数
 * %x -- 整型16进制
 * %h -- 哈希码16进制
 * %字面量
 */
public class ReceiptBuilder {
    private double total = 0;
    private Formatter formatter = new Formatter(new StringBuilder());
    public ReceiptBuilder() {
        formatter.format("%-15s %5s %10s%n", "Item", "Qty", "Price");
        formatter.format("%-15s %5s %10s%n", "----", "---", "-----");
    }
    public void add(String name, int qty, double price) {
        formatter.format("%-15.15s %5d %10.2f%n", name, qty, price);
    }
    public String build() {
        formatter.format("%-15s %5s %10.2f%n", "Tax", "", total * 0.06);
        formatter.format("%-15s %5s %10s%n", "", "", "-----");
        formatter.format("%-15s %5s %10.2f%n", "Total", "", total * 1.06);
        return formatter.toString();
    }

    public static void main(String[] args) {
        ReceiptBuilder builder = new ReceiptBuilder();
        builder.add("Jack's Magic Beans", 4, 4.24);
        builder.add("Princess Peas", 3, 5.1);
        builder.add("Three Bears Porridge", 1, 14.29);
        System.out.println(builder.build());
    }
}
