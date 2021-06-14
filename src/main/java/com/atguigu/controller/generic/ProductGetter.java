package com.atguigu.controller.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: liyinghai
 * @Date: 2021/4/23 22:54
 */
public class ProductGetter<T> {
    Random random = new Random();
    //奖品
    public T product;

    //奖品池
    ArrayList<T> list = new ArrayList<T>();

    //添加奖品
    public void addProduct(T t) {
        list.add(t);
    }

    //抽奖
    public T getProduct(){
        return list.get(random.nextInt(list.size()));
    }

    public <E> E getProduct(ArrayList<E> arrayList) {
        return arrayList.get(random.nextInt(arrayList.size()));
    }

    public void addList(List<? extends T> list) {

    }

    public void setProduct(T product) {
        this.product = product;
    }


}
