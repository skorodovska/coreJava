package com.atguigu.controller.demo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: liyinghai
 * @Date: 2021/4/20 7:46
 *
 * 泛型的特殊之处
 * 静态方法不可以访问类上定义的泛型
 * 如果静态方法操作的类型不确定，可以将泛型定义在方法上
 */
public class GenericDemo1 {
    public static void main(String[] args) {
        Demo<String> demo = new Demo<String>();
        demo.print(123);
        demo.print("str123");
        demo.show("str");
        Demo.method(123);
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("111");
        for (int i = 0;i<arrayList.size();i++) {
            String s = arrayList.get(i);
        }
        
    }
}

class Demo<T>{
    public void show(T t) {
        System.out.println("show:"+t);
    }
    public <E> void print(E e) {
        System.out.println("print:"+e);
    }
    public static <X> void method(X x){
        System.out.println("method:"+x);
    }
}