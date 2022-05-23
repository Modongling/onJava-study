package com.dave.java.newfeature;

/**
 * 17+
 */
public class BlockClassAndBlockInterface {
}
//继承限制-封闭类
sealed class Base permits D1, D2 {}
final class D1 extends Base {}
final class D2 extends Base {}

//实现限制--封闭接口
sealed interface Ifc permits Impl1, Impl2{}
final class Impl1 implements Ifc {}
final class Impl2 implements Ifc {}
//封闭抽象类
sealed abstract class AC permits X {}
final class X extends AC {}

//子类在同个文件permits可以省略
sealed class Shape {}
final class Circle extends Shape {}

//链式结构
sealed class Bottom permits Level1 {}
sealed class Level1 extends Bottom permits Level2 {}
sealed class Level2 extends  Level1 permits Level3 {}
final class Level3 extends Level2 {}

//允许未知子类继承
sealed class Super permits Sub1, Sub2 {}
final class Sub1 extends Super {}
non-sealed class Sub2 extends Super {}
class Any extends Sub2 {}

//record隐式final
sealed interface Employee permits CLevel, Programmer {}
record CLevel(String type) implements Employee {}
record Programmer(String experience) implements Employee {}