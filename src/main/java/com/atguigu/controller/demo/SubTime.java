package com.atguigu.controller.demo;

/**
 * @author skorodovska
 * @version 1.0
 * @date 2021/3/2 23:56
 */
public class SubTime extends GetTime{
    @Override
    void runCode() {
        for (int i = 1; i < 1000; i++) {
            System.out.print(i);
        }
    }
}

abstract class GetTime {
    public final void getTime(){
        long start = System.currentTimeMillis();
        runCode();
        long end = System.currentTimeMillis();
        System.out.println("");
        System.out.println("运行时间为：" + (end - start) + "毫秒");
    }
    abstract void runCode();
}


