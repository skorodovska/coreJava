package com.atguigu.controller.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: liyinghai
 * @Date: 2021/3/21 22:48
 */
public class producerConsumerDemo2 {
    public static void main(String[] args) {

        Resource2 res = new Resource2();

        Producer2 producer = new Producer2(res);
        Consumer2 consumer = new Consumer2(res);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(producer);
        Thread t3 = new Thread(consumer);
        Thread t4 = new Thread(consumer);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class Resource2 {
    private String name;
    private int count = 1;
    private boolean flag = false;
    private Lock lock = new ReentrantLock();
    private Condition condition_pro = lock.newCondition();
    private Condition condition_con = lock.newCondition();

    public void set(String name) throws InterruptedException {
        try {
            lock.lock();
            while (flag) {
                condition_pro.await();
            }
            this.name = name + "---" + count++;
            System.out.println(Thread.currentThread().getName() + ":生产者---------" + this.name);
            this.flag = true;
            condition_con.signal();
        } finally {
            lock.unlock();
        }
    }

    public synchronized void out() throws InterruptedException {

        try {
            lock.lock();
            while (!flag) {
                condition_con.await();
            }
            System.out.println(Thread.currentThread().getName() + ":消费者" + this.name);
            this.flag = false;
            condition_pro.signal();
        }finally {
            lock.unlock();
        }

    }
}

class Producer2 implements Runnable {
    Resource2 res;

    public Producer2(Resource2 res) {
        this.res = res;
    }

    @Override
    public void run() {
        while (true) {
            try {
                res.set("商品");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer2 implements Runnable {
    Resource2 res;

    public Consumer2(Resource2 res) {
        this.res = res;
    }

    @Override
    public void run() {
        while (true) {
            try {
                res.out();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}