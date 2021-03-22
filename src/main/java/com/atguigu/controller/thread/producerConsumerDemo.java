package com.atguigu.controller.thread;

/**
 * @Author: liyinghai
 * @Date: 2021/3/21 22:48
 */
public class producerConsumerDemo {
    public static void main(String[] args) {

        Resource res = new Resource();

        Producer producer = new Producer(res);
        Consumer consumer = new Consumer(res);

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

class Resource {
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name) {
        while (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name + "---" + count++;
        System.out.println(Thread.currentThread().getName() + ":生产者---------" + this.name);
        this.flag = true;
        this.notifyAll();
    }

    public synchronized void out() {
        while (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":消费者" + this.name);
        this.flag = false;
        this.notifyAll();
    }
}

class Producer implements Runnable {
    Resource res;
    public Producer(Resource res) {
        this.res = res;
    }
    @Override
    public void run() {
        while (true) {
            res.set("商品");
        }
    }
}

class Consumer implements Runnable {
    Resource res;
    public Consumer(Resource res) {
        this.res = res;
    }
    @Override
    public void run() {
        while (true) {
            res.out();
        }
    }
}