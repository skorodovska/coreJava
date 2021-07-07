package com.atguigu.controller.fordemo;

/*
嵌套循环的使用
1.嵌套循环：将一个循环结构A声明在另一个循环结构B的循环体中,就构成了嵌套循环

2.
外层循环：循环结构B
内层循环：循环结构A

3. 说明
① 内层循环结构遍历一遍，只相当于外层循环循环体执行了一次
② 假设外层循环需要执行m次，内层循环需要执行n次。此时内层循环的循环体一共执行了m * n次

4. 技巧：
   外层循环控制行数，内层循环控制列数
*/
class ForForTest {
    public static void main(String[] args) {

        //******
        //System.out.println("******");
        for (int i = 0; i < 6; i++) {
            System.out.print("*");
        }
        System.out.print("\n\n\n");
        /*
         ******
         ******
         ******
         ******
         */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        /*			i(行号)		j(*的个数)
         *			1			1
         **			2			2
         ***			3			3
         ****		4			4
         *****		5			5
         */
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        /*			i(行号)		j(*的个数)   规律：i + j = 5 换句话说：j = 5 - i;
         ****		1			4
         ***			2			3
         **			3			2
         *			4			1
         */
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
         */
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5 - Math.abs(5-i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //略

/*

----*
---* *
--* * *
-* * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/

        //上半部分


        //下半部分

    }
}

