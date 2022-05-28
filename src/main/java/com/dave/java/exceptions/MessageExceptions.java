package com.dave.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MessageExceptions {
    public static void main(String[] args) {
        InputStream is = null;
        try {
            is = new FileInputStream(new File("src/main/java/com/dave/java/exceptions/MessageExceptions.java"));
            int content = is.read();
        } catch (IOException e) {

        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {

                }
            }
        }
    }
}
