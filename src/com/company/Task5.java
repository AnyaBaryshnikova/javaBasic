package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int x = scanner.nextInt();
        System.out.println("Введите второе число:");
        int y = scanner.nextInt();
        System.out.println("Введите операцию:");
        String z = scanner.next();

        switch (z) {
            case ("+"):
                System.out.printf("%d + %d = %d", x, y, x + y);
                break;
            case ("-"):
                System.out.printf("%d - %d = %d", x, y, x - y);
                break;
            case ("*"):
                System.out.printf("%d * %d = %d", x, y, x * y);
                break;
            case ("/"):
                if (y == 0) {
                    System.out.println("На ноль делить нельзя!");
                    break;
                }
                System.out.printf("%d / %d = %d", x, y, x / y);
                break;
        }
    }
}
