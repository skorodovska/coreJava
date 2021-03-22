package com.atguigu.controller.thread;

/**
 * @Author: liyinghai
 * @Date: 2021/3/17 21:46
 * <p>
 * 售票程序
 *
 * 创建线程的第二种方式：实现Runnable接口
 *
 * 步骤：
 * 1.定义类实现Runnable接口
 * 2.覆盖Runnable中的run方法
 *  将线程要运行的代码存放在run方法中
 * 3.通过Threa类建立线程对象
 * 4.将Runable接口的实现类对象作为实际参数传递给Thread类的构造方法
 * 5.调用Thread类的start方法开启线程并调用Runnable实现类的run方法
 *
 *
 * 实现方式和继承方式有什么区别
 */

class Ticket extends Thread {

    private static int tick = 100;

    public void run() {
        while (tick > 0) {
            System.out.println(currentThread().getName() + "::sales:" + tick--);
        }
    }
}

class TicketRunnable implements Runnable {
    private int tick = 100;

    @Override
    public void run() {
        while (tick > 0) {
            System.out.println(Thread.currentThread().getName() + "::sales:" + tick--);
        }
    }
}

public class TicketDemo {
    public static void main(String[] args) {
        //继承Thread
        //Ticket ticket1 = new Ticket();
        //ticket1.start();

        //实现Runnable
        TicketRunnable t = new TicketRunnable();

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
