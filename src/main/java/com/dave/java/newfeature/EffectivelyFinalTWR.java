package com.dave.java.newfeature;

import java.io.*;

public class EffectivelyFinalTWR {
    static void old() {
        try(
                InputStream is1 = new FileInputStream(new File("src/main/java/com/dave/java/newfeature/EffectivelyFinalTWR.java"));
                InputStream is2 = new FileInputStream(new File("src/main/java/com/dave/java/newfeature/EffectivelyFinalTWR.java"))
                ) {
            is1.read();
            is2.read();
        } catch (IOException e) {

        }
    }

    static void newM() throws IOException {
       final InputStream is1 = new FileInputStream(new File("src/main/java/com/dave/java/newfeature/EffectivelyFinalTWR.java"));
       //实际上的最终变量 --- 局部变量
        InputStream is2 = new FileInputStream(new File("src/main/java/com/dave/java/newfeature/EffectivelyFinalTWR.java"));
        try(is1; is2) {
            is1.read();
            is2.read();
        }
        is1.read();
        is2.read();
    }

    public static void main(String[] args) {
        old();
        try {
            newM();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
