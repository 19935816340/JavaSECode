package com.company;

public class BreakAndContinueDemo01 {
    public static void main(String[] args) {
        System.out.println("Start");
        for (int i = 0; i <10 ; i++) {
            if (i == 6)
                break;
            System.out.println("hello world"+i);
        }
        System.out.println("end");
    }
}
