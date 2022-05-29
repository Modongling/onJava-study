package com.dave.java.files;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AddAndSubtractPaths {
    static Path base = Paths.get("..", "..",  "..")
            .toAbsolutePath()
            //从当前路径返回路径，消除路径中的冗余元素
            .normalize();
    static void show(int id, Path result) {
        if (result.isAbsolute()) {
            //删除绝对路径中的基准路径
            System.out.println("(" + id + ")r " + base.relativize(result));
        } else {
            System.out.println("(" + id + ")" + result);
        }
        try {
            System.out.println("RealPath:" + result.toRealPath());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        System.out.println(base);
        Path path = Paths.get("src/main/java/com/dave/java/files/AddAndSubtractPaths.java").toAbsolutePath();
        show(1, path);
        Path convoluted = path.getParent().getParent()
                //增加路径名称
                .resolve("strings")
                .resolve("..")
                .resolve(path.getParent().getFileName());
        show(2, convoluted);
        show(3, convoluted.normalize());

        Path path2 = Paths.get("..", "..");
        show(4, path2);
        show(5, path2.normalize());
        show(6, path2.toAbsolutePath().normalize());

        Path path3 = Paths.get(".").toAbsolutePath();
        Path path4 = path3.resolve(path2);
        show(7, path4);
        show(8, path4.normalize());

        Path path5 = Paths.get("").toAbsolutePath();
        show(9, path5);
        //解析路径中的父路径参数，改为父路径+新的路径
        show(10, path5.resolveSibling("strings"));
        show(11, Paths.get("nonexistent"));

    }
}
