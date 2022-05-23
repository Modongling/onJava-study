package com.dave.java.newfeature;

public class CheckedDownCast {
    II i = new JJ();
    JJ j = (JJ) i;
    //不能转换成限制外的类型
    //Something s = i;
}

sealed interface II permits JJ {}
final class JJ implements II {}
class Something {}
