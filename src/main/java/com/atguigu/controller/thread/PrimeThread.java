package com.atguigu.controller.thread;

/**
 * @Author: liyinghai
 * @Date: 2021/5/17 23:44
 */
public class PrimeThread extends Thread {
    long minPrime;

    PrimeThread(long minPrime) {
        this.minPrime = minPrime;
    }

    @Override
    public void run() {
        System.out.println("run方法被调用，传入参数：" + minPrime);
    }
}

class PrimeThreadDemo {
    public static void main(String[] args) {
        byte b = 1;
        byte b2 = 2;
        int b3 = b+b2;
        PrimeThread p = new PrimeThread(143);
        p.start();
    }
}
