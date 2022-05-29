package com.dave.java.overview;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * <b>1.面向对象的定义:</b><br/>
 * 1.1对象具有状态，行为，以及标识
 * 接口描述对象的请求和行为<br/>
 * <b>2.对象:</b><br/>
 * 2.1对象是一个服务提供商，【类的创建者和调用放】<br/>
 * 2.2对象提供封装隐藏内部实现<br/>
 * 2.3组合【has-a】继承【is-a】(逻辑上的复用和重写模板抽象，单根继承GC)<br/>
 * 2.4多态【基类】对象实例【运行前绑定】，运行时确定具体类型【动态绑定】（upper cast）<br/>
 * <b>3.其他:</b><br/>
 * 3.1泛型参数，类型自动适配（避免down cast）<br/>
 * 3.2对象生命周期(GC)<br/>
 * 3.3异常处理<br/>
 * <b>4.基本计算机存储:</b><br/>
 * 4.1register(cpu)<br/>
 * 4.2stack(RAM)Java明确栈的位置，存储对象引用<br/>
 * 4.3heap(RAM)通用内存池，存放所有对象 (new)<br/>
 * 4.4Constant-storage(ROM)常量存储<br/>
 * 4.5non-RAM storage 对象转字节流（序列化/持久化对象）<br/>
 */
public class ObjectBasicReview {
    static int i = 47;
    public static void main(String[] args) {
        /*
         * 1.基本类型,与机器无关,基础类型也可以和对象类型互相转换
         * boolean - Boolean - false
         * char - Character - \u0000(null)
         * short - Short - (short)0
         * byte - Byte -  (byte)0
         * int - Integer - 0
         * long - Long - 0L
         * float - Float - 0.0f
         * double - Double - 0.0d
         * void -Void
         */
        char c = 'x';
        Character ch = Character.valueOf(c);
        System.out.println(ch);
        char cCopy = ch;
        System.out.println(cCopy);

        /*
         * 2.高精度数字
         * BigInteger 内置常量（0,1,2,10）
         * 其他支持位运算以及二数最值判断
         * BigDecimal(1,0,10)，以及进位类型判断
         */
        BigInteger one = new BigInteger("1");
        BigInteger two = BigInteger.valueOf(2L);
        BigInteger sum = one.add(two);
        System.out.println(sum);
        BigInteger sub = one.subtract(two);
        System.out.println(sub);
        BigInteger mul = sum.multiply(two);
        System.out.println(mul);
        //整数除法
        BigInteger div = one.divide(two);
        System.out.println(div);
        //求余运算
        BigInteger remainder = one.remainder(two);
        System.out.println(remainder);
        //幂运算
        BigInteger pow = two.pow(3);
        System.out.println(pow);
        //平方根
        BigInteger sqrt = two.pow(4).sqrt();
        System.out.println(sqrt);
        //this == 0 && val == 0
        BigInteger gcd = BigInteger.ZERO.gcd(new BigInteger("0"));
        System.out.println(gcd);
        //绝对值
        BigInteger abs = new BigInteger("-2");
        System.out.println(abs.abs());
        //相反数
        BigInteger negate = new BigInteger("5");
        System.out.println(negate.negate());
        int compare = one.compareTo(two);
        System.out.println(compare);
        //--------------------------------------------------
        /*
         *  case BigDecimal.ROUND_UP          -> UP; 四舍五入，远离0
            case BigDecimal.ROUND_DOWN        -> DOWN; 向零四舍五入
            case BigDecimal.ROUND_CEILING     -> CEILING; 向正无穷四舍五入
            case BigDecimal.ROUND_FLOOR       -> FLOOR; 向负无穷四舍五入
            case BigDecimal.ROUND_HALF_UP     -> HALF_UP; 向上取整
            case BigDecimal.ROUND_HALF_DOWN   -> HALF_DOWN; 向下取整
            case BigDecimal.ROUND_HALF_EVEN   -> HALF_EVEN; 向下取整，偏向偶数
            case BigDecimal.ROUND_UNNECESSARY -> UNNECESSARY; 不舍入
         */
        BigDecimal a = new BigDecimal("2");
        BigDecimal b = new BigDecimal("3");
        BigDecimal result = a.divide(b, 4, RoundingMode.HALF_UP);
        System.out.println(result);
        /*
         *3.{}作用域
         */
        {
            int x = 12;
            {
                int y = 10;
            }
            System.out.println(x);
        }

        /*
         * 4.类和方法定义
         * ReturnType method(参数列表){方法体}
         * a.method()
         */

        /*
         * 5.名称可见性和引入组件
         * com.dave
         * import java.util.List
         */

        /*
         * 6.static关键字
         * new 创建一个对象并分配内存
         * 1.需要某一个空间来存储某些字段
         * 2.需要使用某个类的方法
         * 与具体是否创建对象无关
         */
        ObjectBasicReview obj1 = new ObjectBasicReview();
        ObjectBasicReview obj2 = new ObjectBasicReview();
        ObjectBasicReview.i++;
        System.out.println(ObjectBasicReview.i);
        StaticAccess.increment();
        System.out.println(obj1.i);
        System.out.println(obj2.i);
        //共享类变量
        System.out.println(obj1.i == obj2.i);
    }
}

class StaticAccess {
    static void increment() {
        ObjectBasicReview.i++;
    }
}
