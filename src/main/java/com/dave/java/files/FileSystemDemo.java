package com.dave.java.files;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemDemo {
    static void show(String id, Object o) {
        System.out.println(id + ": " + o);
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        FileSystem system = FileSystems.getDefault();
        for (FileStore fs : system.getFileStores()) {
            show("File stroe", fs);
        }
        for (Path path : system.getRootDirectories()) {
            show("Root dir", path);
        }
        show("Separator", system.getSeparator());
        //用户和组的主体的对象
        show("UserPrincipalLookupService", system.getUserPrincipalLookupService());
        show("isOpen", system.isOpen());
        show("isReadOnly", system.isReadOnly());
        //访问文件系统定位和加载方式的主体类
        show("FileSystemProvider", system.provider());
        //文件的用户组权限
        show("File Attribute Views", system.supportedFileAttributeViews());
    }
}
