package com.dave.java.exceptions;

public class ConstructorExceptions {
    public static void main(String[] args) {
        try(
                First first = new First();
                //异常终止关闭资源
                SecondException secondException = new SecondException();
                Second second = new Second()
                ) {
            System.out.println("In body");
        } catch (CE e) {
            System.out.println("Catch:" + e);
        }
    }
}

class CE extends Exception {}
class SecondException extends Reporter {
    SecondException() throws CE {
        super();
        throw new CE();
    }
}
