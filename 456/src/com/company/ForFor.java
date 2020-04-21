package com.company;
import java.util.Random;

public class ForFor {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(10);
            System.out.println(num);
        }
        double aDouble = random.nextDouble();
        System.out.println(aDouble);
        boolean b = random.nextBoolean();
        System.out.println(b);

        }
    }
