package com.atguigu.controller.thread;

/**
 * @Author: liyinghai
 * @Date: 2021/3/18 20:19
 */
public class DeadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Dead(true));
        Thread t2 = new Thread(new Dead(false));
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}

class Dead implements Runnable {
    Boolean flag;
    LockObject lockObject = new LockObject();

    public Dead(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (LockObject.objectA) {
                System.out.println("IF A");
                synchronized (LockObject.ObjectB) {
                    System.out.println("IF B");
                }
            }
        } else {
            synchronized (LockObject.ObjectB) {
                System.out.println("ELSE B");
                synchronized (LockObject.objectA) {
                    System.out.println("ELSE A");
                }
            }
        }
    }
}

class LockObject {
    public static Object objectA = new Object();
    public static Object ObjectB = new Object();
}
