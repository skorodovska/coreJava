package com.atguigu.controller.demo;

/**
 * @Author: liyinghai
 * @Date: 2021/3/24 22:51
 *
 * 1.获取
 *      1.1 字符串中包含的字符数，也就是字符串的长度
 *          int length():获取长度
 *      1.2 根据位置获取位置上的字符
 *          char charAt(int index):
 *      1.3 根据字符获取字符在字符串中的位置
 *          int indexOf(int ch):返回的是ch在字符串中第一次出现的位置
 *          int indexOf(int ch, int fromIndex):从fromIndex指定位置开始，获取ch在字符串中出现的位置
 *          int lastIndexOf(int ch, int fromIndex):反向索引一个字符出现的位置
 * 2.判断
 *      2.1 字符串中是否包含某一个子串
 *          boolean contains(str):
 *      2.2 字符串中是否有内容
 *          boolean isEmpty():原理就是判断长度是否为0
 *      2.3 字符串是否以指定的内容开头
 *          boolean startWith(str)
 *      2.4 字符串是否以指定的内容结尾
 *          boolean endWith(str)
 *      2.5 判断字符串内容是否相同，复写Object类中的equals方法
 *          boolean equals(str)
 *      2.6 判断内容是否相同，并忽略大小写
 *          boolean equalsIgnoreCase()
 *
 */
public class StringMethodDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcaaadc";
        String s3 = new String("ABC");
        String s4 = "ArrayDemo.java";


        //length
        System.out.println("s2 length:" + s2.length());

        //charAt 当访问字符串中不存在的下标时会出现”StringIndexOutOfBoundsException“字符串下标越界异常
        System.out.println("s2 charAt index 1:" + s2.charAt(1));

        //indexOf int
        System.out.println("s2 indexOf ascii 98:" + s2.indexOf(98));

        //indexOf char
        System.out.println("s2 indexOf char c:" + s2.indexOf('c'));

        //indexOf char fromIndex
        System.out.println("s2 indexOf char fromIndex 5 c:" + s2.indexOf('c',5));

        //lastIndexOf char fromIndex
        System.out.println("s2 lastIndexOf char fromIndex a:" + s2.lastIndexOf("a",4));

        //contains
        System.out.println("s4 contains:" + s4.contains("Demo"));

        //startWith
        System.out.println("s4 startWith:" + s4.startsWith("Array"));

        //endWith
        System.out.println("s4 endWith:" + s4.endsWith(".java"));

        //equals
        System.out.println("s3 equals s1:" + s3.equals(s1));

        //equalsIgnoreCase
        System.out.println("s3 equalsIgnoreCase s1:" + s3.equalsIgnoreCase(s1));


    }
}
