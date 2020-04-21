package com.company;

public class Demo9 {
    public static void main(String[] args) {
        for (int k = 0; k < 3; k++) {
        A:for (int i = 2; i < 101; i++) {
            B:for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    continue A;
                }
        }
        }
    }
}
