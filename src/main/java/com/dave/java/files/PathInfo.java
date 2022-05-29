package com.dave.java.files;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo {
    static void show(String id, Object p) {
        System.out.println(id + p);
    }

    static void info(Path path) {
        //路径
        show("toString:\n", path);
        //是否存在
        show("Exists:", Files.exists(path));
        //是否是一个文件
        show("RegularFile:", Files.isRegularFile(path));
        //是否是一个目录
        show("Directory:", Files.isDirectory(path));
        //是否是绝对路径
        show("Absolute:", path.isAbsolute());
        //文件名
        show("FileName:", path.getFileName());
        //父路径
        show("Parent:", path.getParent());
        //根路径
        show("Root:", path.getRoot());
        System.out.println("*********************");
    }

    public static void main(String[] args) {
        //取系统参数
        System.out.println(System.getProperty("os.name"));
        //盘符+生成路径
        info(Paths.get("C:", "path", "to", "nowhere", "NoFile.txt"));
        //去指定路径文件
        Path path = Paths.get("src/main/java/com/dave/java/files/PathInfo.java");
        info(path);
        //获取当前路径的绝对路径
        Path abp = path.toAbsolutePath();
        info(abp);
        info(abp.getParent());
        try {
            //实际路径
            info(path.toRealPath());
        } catch (IOException e) {
            System.out.println(e);
        }
        URI uri = path.toUri();
        System.out.println("URI:\n" + uri);
        Path pUri = Paths.get(uri);
        System.out.println(Files.exists(pUri));
        //实际生成的是一个路径（文件+路径）
        File file = abp.toFile();
    }
}
