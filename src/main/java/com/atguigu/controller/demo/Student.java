package com.atguigu.controller.demo;

public class Student extends BaseStudent{
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int age,String nage){
        this.age = age;
        this.name = name;
    }

    @Override
    void study() {
        System.out.println("抽象方法");
    }
}

/**
 * 抽象类特点：
 * 1.抽象方法一定定义在抽象类中
 * 2.抽象方法和抽象类都必须被abstract关键字修饰
 * 3.抽象类不能用new创建对象，因为调用抽象方法没有意义
 * 4.抽象类中的方法想要使用必须由子类覆写其全部抽象方法，建立子类对象调用，如果子类只覆盖了部分抽象方法，那么改子类还是一个抽象类
 */
abstract class BaseStudent {
        abstract void study();
}
