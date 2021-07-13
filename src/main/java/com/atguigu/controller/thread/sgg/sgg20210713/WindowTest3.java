package com.atguigu.controller.thread.sgg.sgg20210713;

/**
 * 使用同步方法解决实现Runnable接口的线程安全问题
 * <p>
 * <p>
 * 关于同步方法的总结：
 * 1. 同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 * 2. 非静态的同步方法，同步监视器是：this
 * 静态的同步方法，同步监视器是：当前类本身
 *
 * @author shkstart
 * @create 2019-02-15 上午 11:35
 */


class Window3 implements Runnable {

    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            sellTicket();
            if (ticket <= 0) {
                break;
            }
        }
    }

    private synchronized void sellTicket(){
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName()+"：卖票，票号为：" + ticket);
            ticket--;
        }
    }
}


public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }

}
