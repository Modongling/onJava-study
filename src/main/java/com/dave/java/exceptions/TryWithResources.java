package com.dave.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
    public static void main(String[] args) {
        //资源说明头，在代码执行完会默认的执行finally关闭资源
        try (InputStream is = new FileInputStream(new File("src/main/java/com/dave/java/exceptions/TryWithResources.java"))) {
            int content = is.read();
        } catch (IOException e) {

        }
    }
}
