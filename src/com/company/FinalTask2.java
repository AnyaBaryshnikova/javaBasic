package com.company;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String str = scanner.nextLine();

        char first = str.charAt(0);
        char operation = str.charAt(1);
        char second = str.charAt(2);
        char third = str.charAt(4);

        if (Character.isAlphabetic(first)) {
            if (operation == '+')
                System.out.println(Integer.parseInt(String.valueOf(third)) - Integer.parseInt(String.valueOf(second)));
            if (operation == '-')
                System.out.println(Integer.parseInt(String.valueOf(third)) + Integer.parseInt(String.valueOf(second)));

        } else if (Character.isAlphabetic(second)) {
            if (operation == '+')
                System.out.println(Integer.parseInt(String.valueOf(third)) - Integer.parseInt(String.valueOf(first)));
            if (operation == '-')
                System.out.println(Integer.parseInt(String.valueOf(first)) - Integer.parseInt(String.valueOf(third)));

        } else if (Character.isAlphabetic(third)) {
            if (operation == '+')
                System.out.println(Integer.parseInt(String.valueOf(first)) + Integer.parseInt(String.valueOf(second)));
            if (operation == '-')
                System.out.println(Integer.parseInt(String.valueOf(first)) - Integer.parseInt(String.valueOf(second)));

        }
    }
}
