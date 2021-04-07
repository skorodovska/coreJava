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
 * 3.转换
 *      3.1 将字符数组转成字符串
 *          构造函数：String(char[])
 *                  String(char[] data,int offset,int count):将字符数组中一部分转成字符串，从offset包含offset
 *          静态方法：static String copyValueOf(char[])
 *                  static String copyValueOf(char[] data,int offset,int count)
 *                  static String valueOf(char[])
 *      3.2 将字符串转成字符数组
 *          char[] toCharArray()
 *      3.3 将字节数组转成字符串
 *          构造函数：String(byte[])
 *                  String(byte[] data,int offset,int count):将字节数组中一部分转成字符串，从offset包含offset
 *      3.4 将字符串转成字节数组
 *          byte[] getBytes()
 *      3.5 将基本数据类型转成字符串
 *          static String valueOf(int);
 *          static String valueOf(double);
 *          3+"" == String.value(3)
 *  4.替换
 *      String replace(oldChar,newChar) 字符替换
 *      String replace(oldCharSequence,newCharSequence) 字符串替换
 *  5.切割
 *      String[] split(regex)
 *  6.子串 获取字符串中的一部分
 *      String substring(begin)
 *      String substring(begin,end) 包含头不包含尾
 *  7.转换，去除空格，比较
 *      7.1 将字符串转成大写或者小写
 *          String toUpperCase();
 *          String toLowerCase();
 *      7.2 将字符串两端的多个空格去除
 *          String trim();
 *      7.3 对两个字符串进行自然顺序的比较
 *          int compareTo(String);
 *      
 */
public class StringMethodDemo {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcaaadc";
        String s3 = "ABC";
        String s4 = "ArrayDemo.java";
        String s5 = "  abc  ";
        String s6 = "abc";
        String s7 = "a1c";
        char[] chars = {'1','2','3','4'};
        byte[] bytes = {1,65,97,4,5}; //对应ASCII码表 65:A  97:a，也可以直接传入字符，可以自动转换
        String name = "zhangsan,lisi,wangwu";



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

        //String char[] offset count
        System.out.println("chars String char[] offset count:" + new String(chars,1,2));

        //copyValueOf char[] offset count
        System.out.println("chars copyValueOf char[] offset count:" + String.copyValueOf(chars,1,2));

        //String byte[] offset count
        System.out.println("bytes String byte[] offset count:" + new String(bytes,1,2));

        //toCharArray
        System.out.println("s1 toCharArray length:" + s1.toCharArray().length);

        //replace
        System.out.println("s1 replace old:" + s1 + ";new:" + s1.replace("a", "p"));

        //split
        String[] names = name.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println("names index " + i + ":" + names[i]);
        }

        //substring 包含头不包含尾
        System.out.println("s1 substring 1 2 :" + s1.substring(1,3));

        //toUpperCase
        System.out.println("s4 toUpperCase old:" + s4 + "; new:" + s4.toUpperCase());

        //toLowerCase
        System.out.println("s4 toLowerCase old:" + s4 + "; new:" + s4.toLowerCase());

        //trim
        System.out.println("s5 trim old:" + s5 + "; new:" + s5.trim());

        //compareTo
        System.out.println("s6 compareTo s7:" + s6.compareTo(s7));

        //反转
        System.out.println(reverseString("abc"));

        //计数
        System.out.println(getSubCount("absdfsadjfksasajf","a"));

        System.out.println("abbbc".indexOf("b",1));

    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int start = 0, end = chars.length - 1; start < end; start++, end--) {
            swap(chars, start, end);
        }
        return new String(chars);
    }

    public static void swap(char[] chars,int start,int end) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }

    public static int getSubCount(String str,String key) {
        int count = 0;
        int index = 0;
        while((index = str.indexOf(key))!=-1) {
            str = str.substring(index+key.length());
            count++;
        }
        return count;
    }

    public static int getSubCountMax(String str,String key) {
        int count = 0;
        int index = 0;
        while((index = str.indexOf(key,index))!=-1) {
            index = index + key.length();
            count++;
        }
        return count;
    }

}
