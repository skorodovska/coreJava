package com.atguigu.controller.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: liyinghai
 * @Date: 2021/4/25 22:31
 */
public class TestJava implements Comparable<String> {

    public static void main(String[] args) {
        Fanxing<Fu> fanxing = new Fanxing();
        fanxing.get(new Zi());

        show(fanxing);
    }

    public static void show(Fanxing<Fu> fanxing){

    }
    @Override
    public int compareTo(String o) {
        return 0;
    }
}

class TestJava2 implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        List<Fu> list = new ArrayList<Fu>();
        list.add(new Zi());

        return 0;
    }
}

class Fu{}
class Zi extends Fu{}


class Fanxing<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void get(T t){

    }
}