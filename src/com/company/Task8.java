package com.company;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        if (n < 0)
            n *= -1;

        int k = 1;
        int sum = 0;

        while (k <= n) {

            sum += k;
            k += 2;
        }

        System.out.println("Сумма нечетных эдементов от 1 до " + n + " равно " + sum);
    }
}
