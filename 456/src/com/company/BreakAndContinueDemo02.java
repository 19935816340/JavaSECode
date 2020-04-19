package com.company;

public class BreakAndContinueDemo02 {
    public static void main(String[] args) {
        //关于continue的入门案例
        //打印1~10之间，所有不是3的倍数的整数
        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0)
                continue;
            //如果不是3的倍数，就打印i
            System.out.println(i);
        }

    }
}
