package com.company;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();
        if (n < 0)
            n *= -1;

        double[] arr = new double[n];
        for (int i = 0; i < n; ++i) {
            System.out.println("Введите следующий элемент: ");
            arr[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double ar : arr) {
            sum += ar;
        }

        double avg = sum / n;
        System.out.println("Массив:");
        for (double ar : arr) {
            System.out.printf("%.3f" + " ", ar * avg);
        }
    }
}
