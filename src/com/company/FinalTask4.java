package com.company;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        String answer = "Заархивированный вирус";
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ответ: ");
        String userAnswer = scanner.nextLine();
        for (int i = 0; i < 3; ++i) {
            if (userAnswer.equals(answer)) {
                System.out.println("Правильно!");
                break;
            }

            if (userAnswer.equals("Подсказка")) {
                if (i == 0)
                    System.out.println("вирус");
                else
                    System.out.println("Подсказка уже недоступна");

                System.out.print("Введите ответ: ");
                userAnswer = scanner.nextLine();
                continue;
            }

            if (!userAnswer.equals(answer) && i == 2)
                System.out.println("Обидно, приходи в другой раз");
            else if (userAnswer.equals(answer) && i == 2)
                System.out.println("Правильно!");
            else {
                System.out.print("Введите ответ: ");
                userAnswer = scanner.nextLine();
                continue;
            }
        }
    }
}
