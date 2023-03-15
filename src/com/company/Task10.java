package com.company;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество размерноть матрицы: ");
        int n = scanner.nextInt();
        if (n < 0)
            n *= -1;

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j) {
                System.out.println("Введите следующий элемент: ");
                arr[i][j] = scanner.nextInt();
            }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(arr[i][j] * 3 + " ");
            }
            System.out.println("");
        }
    }
}
