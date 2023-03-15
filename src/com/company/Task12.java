package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        System.out.println("Строка содержит подстроку Java: " + str.contains("Java"));
        System.out.println("Строка начинается с подстроки I like: " + str.startsWith("I like"));
        System.out.println("Строка заканчивается подстрокой !!!: " + str.endsWith("!!!"));

        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase(Locale.ROOT));
            str = str.replace('a', 'o');
            System.out.println(str.substring(str.indexOf("J"), str.lastIndexOf("o") + 1));
        }
    }
}
