package com.dave.java.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile {
    private BufferedReader in;

    public InputFile(String name) throws Exception {
        try {
            in = new BufferedReader(new BufferedReader(new FileReader(name)));
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + name);
            //文件未关闭抛出一查
            throw e;
        } catch (Exception e) {
            try {
                //关闭方法异常捕获
                if (in != null) {
                    in.close();
                }
            } catch (IOException e2) {
                System.out.println("in.close unsuccessful");
            }
            //如果异常继续抛出
            throw e;
        } finally {
            //构造器完成如果在finally调用close()会直接关闭不符合预期
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            //不抛出异常这一块异常就不会再继续向外抛，也就是catch之后吞掉了异常
            //明确表示错误中断异常转为RuntimeException是一个不错的方式
            throw new RuntimeException("readLine() failed");
        }
        return s;
    }

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose succes");
        } catch (IOException e2) {
            throw new RuntimeException("readLine() failed");
        }
    }

    public static void main(String[] args) {
        try {
            InputFile inputFile = new InputFile("src/main/java/com/dave/java/exceptions/InputFile.java");
            try {
                String s;
                int i = 1;
                while ((s = inputFile.getLine()) != null) {
                    ;
                }
            } catch (Exception e) {
                System.out.println("Catch in main");
                e.printStackTrace(System.out);
                //构造器执行成功在进行清理
            } finally {
                inputFile.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile failed");
        }
    }
}
