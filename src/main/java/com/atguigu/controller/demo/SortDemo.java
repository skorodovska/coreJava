package com.atguigu.controller.demo;

/**
 * @Author: liyinghai
 * @Date: 2021/3/17 10:12
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 5;
        ints[2] = 2;
        ints[3] = 3;
        ints[4] = 4;

        for (int i=ints.length - 1; i > 0; i--) {
            for (int j=0; j<=i-1; j++) {
                if (ints[j] > ints[j+1]) {
                    swap(ints,j,j+1);
                }
            }
        }
        for (int i : ints) {
            System.out.println(i);
        }
    }

    public static void swap(int[] ints,int a,int b) {
        int c = ints[a];
        ints[a] = ints[b];
        ints[b] = c;
    }
}
