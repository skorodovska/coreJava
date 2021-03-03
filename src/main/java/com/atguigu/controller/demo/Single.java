package com.atguigu.controller.demo;

/**
 * @author skorodovska
 * @version 1.0
 * @date 2021/3/1 21:40
 *
 * 单例设计模式
 *
 * 1.为避免其他程序过多建立对象，禁止其他程序建立该类对象。
 * 2.为了让其他程序访问到该对象，只能在本类中自定义一个对象。
 * 3.为了其他程序对自定义对象的访问，可以对外提供一些访问方式。
 *
 * 实现
 * 1.将构造函数私有化
 * 2.在类中创建一个本类对象
 * 3.提供一个方法可以获取到该对象
 */
/*
public class Single {

    private Single(){
        System.out.println("建议使用饿汉式");
    }

    private static Single s = new Single();

    public static Single getInstance() {
        return s;
    }

}*/

public class Single {
    private Single(){
        System.out.println("懒汉式");
    }
    private static Single s = null;
    public static Single getInstance() {
        if (s == null) {
            synchronized(Single.class) {
                if (s == null) {
                    s = new Single();
                }
            }
        }
        return s;
    }
}
