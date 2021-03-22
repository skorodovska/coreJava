package com.atguigu.controller.demo;

/**
 * @Author: liyinghai
 * @Date: 2021/3/18 16:07
 */
public class BankDemo {
    public static void main(String[] args) {
        Cus cus = new Cus();
        Thread t1 = new Thread(cus);
        Thread t2 = new Thread(cus);
        t1.start();
        t2.start();
    }
}

class Bank {
    private int sum;
    Object obj = new Object();
    public void add(int money) {
        synchronized(obj){
            sum += money;
            try{Thread.sleep(10);}catch (Exception e){}
            System.out.println("sum:" + sum);
        }
    }
}

class Cus implements Runnable {
    Bank bank = new Bank();
    @Override
    public void run() {
        for (int i=0; i<3; i++) {
            bank.add(100);
        }
    }
}