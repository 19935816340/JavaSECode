package com.company;

public class Demo8 {
    public static void main(String[] args) {
        for (int k = 0; k < 3; k++) {
            for (int i = 3; i <= 100; i++) {
                int cishu = 0;
                for (int j = 2; j <= 100; j++) {
                    if (i % j != 0) {
                        cishu++;}
                        if (cishu == 1) {
                            System.out.print(i);
                        }
                    }
                }
            }
        }}