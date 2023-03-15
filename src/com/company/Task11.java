package com.company;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String n = scanner.next();

        System.out.println("Введите число: ");
        int m = scanner.nextInt();

        int k = Integer.parseInt(n);

        if (m > k) {
            System.out.println("Большее число: " + m);
            System.out.println("Меньшее число: " + (double) k);
        } else {
            System.out.println("Большее число: " + k);
            System.out.println("Меньшее число: " + (double) m);
        }
    }
}
