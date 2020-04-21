package com.company;


public class Demo3 {
    public static void main(String[] args) {
// 复杂写法
            //        for (int i = 1; i <= 12 ; i++) {
            //            System.out.println("2020年" + i + "月\t");
            //        }
            //        //2021
            //        for (int i = 1; i <= 12 ; i++) {
            //            System.out.println("2021年" + i + "月\t");
            //        }
            //        //2022
            //        for (int i = 1; i <= 12 ; i++) {
            //            System.out.println("2022年" + i + "月\t");
            //        }
            //        //2023
            //        for (int i = 1; i <= 12 ; i++) {
            //            System.out.println("2023年" + i + "月\t");
            //        }
        //简单写法
        for (int i = 2020; i <= 2023; i++) {
            for (int j = 1; j <=12 ; j++) {
                System.out.print(i + "年" + j + "月\t");
            }
            System.out.println();
        }
    }
}