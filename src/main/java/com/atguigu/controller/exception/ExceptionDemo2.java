package com.atguigu.controller.exception;

/**
 * @Author: liyinghai
 * @Date: 2021/3/15 21:14
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        try{
            int x = 1/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
        Inter inter = new Inter() {
            @Override
            public void show(int a, int b) {

            }

            @Override
            public void func() {

            }
        };
        inter.func();
        inter.show(1,2);
    }
}

class FuException extends Exception {
    FuException(String message) {
        super(message);
    }
}

class ZiException extends FuException {


    ZiException(String message) {
        super(message);
    }
}

interface Inter {
    void show(int a,int b);
    void func();
}
