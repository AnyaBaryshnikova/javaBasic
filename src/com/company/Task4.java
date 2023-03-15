package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        int x = scanner.nextInt();
        System.out.println("Введите y:");
        int y = scanner.nextInt();
        System.out.println("Введите z:");
        int z = scanner.nextInt();

        double avg = (double) (x + y + z) / 3;
        System.out.printf("Среднее арифметическое: %.2f", avg);

        double k = Math.floor(avg / 2);
        System.out.printf("%.2f", k);

        if (k > 3)
            System.out.println("Программа выполнена корректно");
    }
}
