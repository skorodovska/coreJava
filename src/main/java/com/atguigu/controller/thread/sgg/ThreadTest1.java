package com.atguigu.controller.thread.sgg;

/**
 * 创建多线程的方式二：实现Runnable接口
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法：run()
 * 3.创建实现类的对象
 * 4.将此对象传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 *
 * 比较创建线程的两种方式。
 * 
 * @Author: liyinghai
 * @Date: 2021/7/7 23:09
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        //3.创建实现类的对象
        Mthead mthead = new Mthead();
        
        //4.将此对象传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(mthead);

        //5.通过Thread类的对象调用start()
        t1.start();
    }
}

/**
 * 1.创建一个实现了Runnable接口的类
 */
class Mthead implements Runnable{

    /**
     * 2.实现类去实现Runnable中的抽象方法：run()
     */
    @Override
    public void run() {
        for (int i = 0,iMax = 100; i < iMax; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
