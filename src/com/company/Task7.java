package com.company;

import java.util.Scanner;

public class Task7 {
    private static final int X = 1;
    private static final int Y = 2;
    private static final int Z = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        if (n < 0)
            n *= -1;

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.println("Введите следующий элемент: ");
            arr[i] = scanner.nextInt();
        }

        for (int ar : arr) {
            if (ar == X || ar == Y || ar == Z)
                System.out.println("Данное значение содержится в константах: " + ar);
        }
    }
}
