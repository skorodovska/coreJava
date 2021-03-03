package com.atguigu.controller.tools;

/**
 * @author skorodovska
 */
public class ArrayTool {

    /**
     * 斐波纳契求值
     * @param number 接收int类型的下标
     * @return 返回int类型下标对应斐波那契数列中的值
     */
    public static int finnc(int number) {
        if (number == 1 || number == 2) {
            return 1;
        } else {
            return finnc(number - 1) + finnc(number - 2);
        }
    }

    /**
     * 整型求和
     * @param number
     * @return
     */
    public static int sum(int number) {
        if (number == 1) {
            return 1;
        } else {
            return number + sum(number - 1);
        }
    }

    /**
     *
     * @param arr
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
    }
}
