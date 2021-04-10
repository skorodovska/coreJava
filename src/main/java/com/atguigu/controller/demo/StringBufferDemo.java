package com.atguigu.controller.demo;

/**
 * @Author: liyinghai
 * @Date: 2021/4/7 22:07
 *
 *
 * 1.存储
 *      StringBuffer append():将指定数据作为参数添加到已有数据结尾处。
 *      StringBuffer insert(index,str):可以将数据插入到指定index位置。
 *
 * 2.删除
 *      StringBuffer delete(start,end):删除缓冲区中的数据，包含start 不包含end
 *      StringBuffer deleteCharAt(index):删除指定位置字符
 *
 * 3.获取
 *      char charAt(int index)
 *      int indexOf(String str)
 *      int lastIndexOf(String str)
 *      int length()
 *      String substring(int start,int end)
 *
 * 4. 修改
 *      StringBuffer replace(start,end,String)
 *      void setCharAt(int index,char ch)
 *
 * 5.反转
 *      StringBuffer reverse()
 *
 *
 */
public class StringBufferDemo {

    public static void main(String[] args) {
        //method_del();
        Integer i = 100;
        String str = "100";
        Long l = 100L;
        System.out.println(str.equals(i));
    }

    public static void method_del(){
        StringBuffer sb = new StringBuffer("abcde");
        sb.delete(1,3);
        System.out.println(sb.toString());
        sb.insert(1,"插入");
        System.out.println(sb.toString());
        sb.delete(0,sb.length());
        System.out.println(sb.toString());
    }
}
