package com.company;

public class Demo6 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int k = 5 - i;
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println("\t");
        }
    }
}
