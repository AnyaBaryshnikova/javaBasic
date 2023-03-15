package com.company;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {

        int[] arr = new int[15];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = rnd.nextInt(41) - 20;
        }

        int max = arr[0];
        int min = arr[0];

        for (int ar : arr) {
            if (ar > max)
                max = ar;
            if (ar < min)
                min = ar;
        }

        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент по модулю : " + Integer.max(Math.abs(max), Math.abs(min)));


    }
}
