package com.atguigu.controller.thread.sgg;

/**
 * 例子：创建三个窗口卖票，总票数为100张
 * 存在线程安全问题，待解决
 *
 * @Author: liyinghai
 * @Date: 2021/7/7 22:59
 */
public class WindowsTest {
    public static void main(String[] args) {
        Windows t1 = new Windows();
        Windows t2 = new Windows();
        Windows t3 = new Windows();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Windows extends Thread{
    private static int ticket = 100;
    @Override
    public void run() {
        while (ticket > 0) {
            System.out.println(getName()+" : 卖票，票号为 " + ticket);
            ticket--;
        }
    }
}
