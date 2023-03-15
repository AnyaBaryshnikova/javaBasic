package com.company;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс: ");
        String str = scanner.nextLine();

        if(str.contains(","))
           str = str.replace(',', '.');
        double course = Double.parseDouble(str);

        System.out.println("Введите количество рублей: ");
        str = scanner.nextLine();

        if(str.contains(","))
            str = str.replace(',', '.');
        double rubles = Double.parseDouble(str);

        System.out.printf("Курс доллара: %.2f\nКоличество рублей: %.2f\nИтого: %.2f долларов", course, rubles, rubles / course);
    }
}
