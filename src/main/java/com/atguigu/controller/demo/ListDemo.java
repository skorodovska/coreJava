package com.atguigu.controller.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @Author: liyinghai
 * @Date: 2021/4/10 8:26
 *
 * List集合特有迭代器。ListIterator是Iterator的子接口
 *
 * 使用Iterator迭代时，不可以通过集合对象的方法去操作集合中的元素
 * 因为会发生并发修改异常ConcurrentModificationException，所以只能用Iterator迭代器的方法去操作元素
 * 可是Iterator的方法是有限的只有判断、取出、删除，如果需要添加、修改等就需要使用它的子接口ListIterator，
 * 该接口只能通过List集合的listIterator来获取
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(){{
           this.add("java01");
           this.add("java02");
           this.add("java03");
        }};

        for (Iterator<String> iterator = list.iterator();iterator.hasNext();) {
            String temp = iterator.next();
            if ("java01".equals(temp)) {
                //list.add("java04");  ConcurrentModificationException 在迭代器内使用集合方法向集合新增元素会产生并发修改异常，可以考虑listIterator
                iterator.remove();
            }
        }
        System.out.println(list);


        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            String temp = listIterator.next();//正向遍历
            if ("java03".equals(temp)) {
                
                listIterator.add("java04");
            }
        }
        System.out.println(list);

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
