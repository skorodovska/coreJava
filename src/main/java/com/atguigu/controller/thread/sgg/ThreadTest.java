package com.atguigu.controller.thread.sgg;

/**
 * 多线程的创建，方式一：继承于Thread类
 * 1. 创建一个继承于Thread类的子类
 * 2. 重写Thread类的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建Thread类的子类的对象
 * 4. 通过此对象调用start()
 * <p>
 * 例子：遍历100以内的所有的偶数
 *
 * @Author: liyinghai
 * @Date: 2021/7/6 21:45
 */
public class ThreadTest {
    public static void main(String[] args) {

        //3. 创建Thread类的子类对象
        MyThread t1 = new MyThread();

        //4. 通过此调用start() : ①启动当前线程 ②调用当前线程的run()
        t1.start();

        //问题一：我们不能通过直接调用run()的方式启动线程,直接调用run()并没有创建新的线程
        //t1.run();

        //问题二：多次启动一个线程是不合法的，会报IllegalThreadStateException
        //t1.start();

        //需要重新创建一个线程对象
        MyThread t2 = new MyThread();
        t2.start();

        ////如下操作仍然是在main线程中执行的。
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() +" : "+ i);
        }
    }
}

/**
 * 1. 创建一个继承于Thread类的子类
 */
class MyThread extends Thread {
    /**
     * 2. 重写Thread类的run()
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i + "******run******");
            }
        }
    }
}


