package com.atguigu.controller.thread.sgg;

/**
 *  * 例子：使用Runnable方式创建三个窗口卖票，总票数为100张
 *  * 存在线程安全问题，待解决
 * @Author: liyinghai
 * @Date: 2021/7/7 23:28
 */
public class WindowsTest1 {
    public static void main(String[] args) {
        Windows1 windows1 = new Windows1();

        Thread t1 = new Thread(windows1);
        Thread t2 = new Thread(windows1);
        Thread t3 = new Thread(windows1);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3
                .start();

    }
}

class Windows1 implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + " :卖票，票号为：" + ticket);
            ticket--;
        }
    }
}
