package com.atguigu.controller.thread;

/**
 * @Author: liyinghai
 * @Date: 2021/3/22 23:25
 */
public class StopThreadDemo {
    public static void main(String[] args) {
        StopThread stopThread = new StopThread();
        Thread t1 = new Thread(stopThread);
        Thread t2 = new Thread(stopThread);
        t1.start();
        t2.start();
        int i = 0;

        while(true) {
            if (i++ == 60) {
                t1.interrupt();
                t2.interrupt();
                break;
            }
            System.out.println(Thread.currentThread().getName()+"---main while"+i);
        }
        System.out.println(Thread.currentThread().getName()+"---main close");
    }
}

class StopThread implements Runnable {
    private boolean flag = true;
    @Override
    public synchronized void run() {
        while(flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName()+"---catch");
                flag = false;
            }
            System.out.println(Thread.currentThread().getName()+"---run");
        }
    }

    public void stop() {
        this.flag = false;
    }
}
