package com.dave.java.controlflow;

import static com.dave.java.utils.Range.range;

/**
 * continue:<br/>
 * 1.跳到最内层循环起始处继续执行<br/>
 * 2.跳到标签的位置，并重新进入标签后的循环<br/>
 * break:<br/>
 * 1.跳出当前循环<br/>
 * 2.跳出标签所指的循环
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : range(100)) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) {
                break;
            }
            if (i % 10 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
