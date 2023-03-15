package com.company;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - расстояние, 2 - масса:");
        int x = scanner.nextInt();

        int y = 0;
        if (x == 1) {
            System.out.println("1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            y = scanner.nextInt();
        } else {
            System.out.println("1 - килограмм, 2 - стоун, 3 - тонна, 4 - фунт");
            y = scanner.nextInt();

        }
        System.out.println("Введите число:");
        int z = scanner.nextInt();
        if (z < 0)
            z *= (-1);

        System.out.println("Результат: ");

        if (x == 1) {
            switch (y) {
                case (1) -> {
                    System.out.printf("Метры: %.5f", (double) z);
                    System.out.printf("Мили: %.5f", z * 0.000621371);
                    System.out.printf("Ярды: %.5f", z * 1.09361296);
                    System.out.printf("Футы: %.5f", z * 3.280838879);
                }
                case (2) -> {
                    System.out.printf("Мили: %.5f", (double) z);
                    System.out.printf("Метры: %.5f", z * 1609.34);
                    System.out.printf("Ярды: %.5f", (double) z * 1760);
                    System.out.printf("Футы: %.5f", (double) z * 5280);
                }
                case (3) -> {
                    System.out.printf("Ярды: %.5f", (double) z);
                    System.out.printf("Метры: %.5f", z * 0.9144);
                    System.out.printf("Мили: %.5f", z * 0.000568182);
                    System.out.printf("Футы: %.5f", (double) z * 3);
                }
                case (4) -> {
                    System.out.printf("Футы: %.5f", (double) z);
                    System.out.printf("Метры: %.5f", z * 0.3048);
                    System.out.printf("Мили: %.5f", z * 0.000189394);
                    System.out.printf("Ярды: %.5f", z * 0.333333);
                }
            }
        } else {
            switch (y) {
                case (1) -> {
                    System.out.printf("Килограммы: %.5f", (double) z);
                    System.out.printf("Стоуны: %.5f", z * 0.157473);
                    System.out.printf("Тонны: %.5f", z * 0.001);
                    System.out.printf("Фунты: %.5f", z * 2.20462);
                }
                case (2) -> {
                    System.out.printf("Стоуны: %.5f", (double) z);
                    System.out.printf("Килограммы: %.5f", z * 6.35029);
                    System.out.printf("Тонны: %.5f", z * 0.00635029);
                    System.out.printf("Фунты: %.5f", (double) z * 14);
                }
                case (3) -> {
                    System.out.printf("Тонны: %.5f", (double) z);
                    System.out.printf("Килограммы: %.5f", (double) z * 1000);
                    System.out.printf("Стоуны: %.5f", z * 157.473);
                    System.out.printf("Фунты: %.5f", z * 2204.62);
                }
                case (4) -> {
                    System.out.printf("Фунты: %.5f", (double) z);
                    System.out.printf("Килограммы: %.5f", z * 0.453592);
                    System.out.printf("Стоуны: %.5f", z * 0.0714286);
                    System.out.printf("Тонны: %.5f", z * 0.000453592);
                }
            }
        }
    }
}
