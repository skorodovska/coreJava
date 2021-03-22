package com.atguigu.controller.demo;

import com.atguigu.controller.tools.ArrayTool;

public class TestMain {
    public static void main(String[] args) throws Exception {
        /*int[] arr = {10,2,5,4};
        ArrayTool.printArr(arr);
        ArrayTool.bubbleSort(arr);
        ArrayTool.printArr(arr);
        new TestMain();*/

        /*//单例设计模式
        Single single = Single.getInstance();

        //抽象
        Student student = new Student(1,"zhangsan");
        student.study();*/

        SubTime subTime = new SubTime();
        subTime.getTime();

    }
    /*
    int i = 10;
    {
        System.out.println("构造代码块，在new对象时调用，优先于构造方法"+i);
    }
    static {
        System.out.println("静态代码块，在类加载的时候调用");
    }*/
}
