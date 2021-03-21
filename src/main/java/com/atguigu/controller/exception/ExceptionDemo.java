package com.atguigu.controller.exception;

/**
 * @Author: liyinghai
 * @Date: 2021/3/14 18:00
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            System.out.println(d.div(1, -7));
        } catch (FushuException e) {
            System.out.println(e.getMessage());
            System.out.println("错误的负数是：" + e.getValue());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    try {

    } catch (Exception e) {

    }
        System.out.println(d.div2(3,-4));
    }
}

/**
 * throws 和 throw的区别
 * throws使用在函数上
 * throw使用在函数内
 *
 * throws 后面跟着异常类，可以跟多个，用逗号隔开。
 * throw 跟的是异常对象。
 */
class FushuException extends Exception {

    private int value;

    FushuException(String message, int value) {
        super(message);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class Demo {
    int div(int a, int b) throws FushuException {
        if (b < 0) {
            throw new FushuException("出现除数是负数的情况----/by fushu", b);
        }
        return a / b;
    }

    int div2(int a, int b) {
        if (b < 0) {
            throw new RuntimeException("runtimeException");
        }
        return a / b;
    }
}
