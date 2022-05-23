package com.dave.java.controlflow;

public class StringSwitch {
    public static void main(String[] args) {
        String color = "red";
        if ("red".equals(color)) {
            System.out.println("RED");
        } else if ("green".equals(color)) {
            System.out.println("GREEN");
        } else if ("blue".equals(color)) {
            System.out.println("BLUE");
        } else if ("yellow".equals(color)) {
            System.out.println("YELLOW");
        } else {
            System.out.println("Unknown");
        }
        switch (color) {
            case "red" -> System.out.println("RED");
            case "green" -> System.out.println("GREEN");
            case "blue" -> System.out.println("BLUE");
            case "yellow" -> System.out.println("YELLOW");
            default -> System.out.println("Unknown");
        }
    }
}
/*
 * switch (color) {
 *             case "red":
 *                 System.out.println("RED");
 *                 break;
 *             case "green":
 *                 System.out.println("GREEN");
 *                 break;
 *             case "blue":
 *                 System.out.println("BLUE");
 *                 break;
 *             case "yellow":
 *                 System.out.println("YELLOW");
 *                 break;
 *             default:
 *                 System.out.println("Unknown");
 *                 break;
 *         }
 */