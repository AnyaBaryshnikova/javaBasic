package com.company;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        String[] arr = str.split(" ");
        int count = 0;
        for (String ar : arr) {
            if (ifOnlyLatinitsa(ar)) {
                System.out.println(ar);
                ++count;
            }
        }
        System.out.println("Количество слов: " + count);
    }

    private static boolean ifOnlyLatinitsa(String str) {
        for (int i = 0; i < str.length(); ++i) {
            if ((int) str.charAt(i) < (int) 'A' || (int) str.charAt(i) > (int) 'z')
                return false;
        }
        return true;
    }
}
