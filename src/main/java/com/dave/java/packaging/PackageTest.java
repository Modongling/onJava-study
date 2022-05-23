package com.dave.java.packaging;

/**
 * 访问修饰符说明
 * public -- 所有位置都可以访问
 * protected -- 父子类+同包类
 * default -- 同包类
 * private -- 本类访问
 * 访问控制符组要用于控制类，方法，属性的访问权限，以实现封装
 * -----------------------------------------
 * package -- 类的命名空间
 * .java文件 --- .class文件
 * package下面对应着一组.class文件
 * CLASSPATH查找.class文件的目录，把包名换成路径名
 * -----------------------------------------
 * 当出现多个同名类时，通过包的全路径进行区分
 * import可作为条件编译导入
 * -----------------------------------------
 * JDK11+
 * java --list-modules 模块信息
 * java --describe-module java.base 具体模块信息
 */
public class PackageTest {
}
