package com.atguigu.controller.thread;

/**
 * @Author: liyinghai
 * @Date: 2021/3/18 22:23
 */
public class InputOutputDemo {
    public static void main(String[] args) {
        Res res = new Res();
        new Thread(new Input(res)).start();
        new Thread(new Output(res)).start();
    }
}

class Input implements Runnable {

    private Res res;
    public Input(Res res) {
        this.res = res;
    }
    @Override
    public void run() {
        int x = 0;
        while(true) {
                if (x==0) {
                    res.set("jekyll","man");
                } else {
                    res.set("小红","女");
                }
            x = (x+1)%2;
        }
    }
}

class Output implements Runnable {
    private Res res;
    public Output(Res res) {
        this.res = res;
    }
    @Override
    public void run() {
        while(true) {
            res.out();
        }
    }
}

class Res {
    private boolean flag;
    private String name;
    private String sex;

    public void set(String name,String sex) {
        synchronized (this) {
            if (this.flag) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.name = name;
            this.sex = sex;
            this.flag = true;
            this.notifyAll();
        }
    }

    public void out() {
        synchronized(this) {
            if (!this.flag) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(this.name + "::" + this.sex);
            this.flag = false;
            this.notifyAll();
        }
    }
}