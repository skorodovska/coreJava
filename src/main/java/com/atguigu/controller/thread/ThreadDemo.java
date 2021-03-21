package com.atguigu.controller.thread;

/**
 * @Author: liyinghai
 * @Date: 2021/3/17 19:36
 *
 * 线程有自己的默认名称
 * Thread-编号 编号从0开始
 *
 * static Thread currentThread():获取当前线程对象
 * getName():获取线程名称
 * setName()/构造函数:设置线程名称
 */

public class ThreadDemo {
    public static void main(String[] args) {
        Demo demo1 = new Demo("demo1");
        Demo demo2 = new Demo("demo2");
        System.out.println(Thread.currentThread().getName());
        demo1.start();
        demo2.start();

        for (int i=0; i<60; i++) {
            System.out.println("ThreadDemo run:" + i);
        }
    }
}

class Demo extends Thread{
    public Demo(String demoName) {
        super(demoName);
    }
    @Override
    public void run(){
        for (int i=0; i<60; i++) {
            System.out.println((Thread.currentThread() == this) + "::" + this.getName() + " run:" + i);
        }
    }
}


