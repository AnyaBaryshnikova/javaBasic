package com.company;

import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int n = scanner.nextInt();

        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            System.out.print("Введите следующую строку: ");
            arr[i] = scanner.next();
        }

        long max = arr[0].chars().distinct().count();
        String st = arr[0];

        for(int i = 1; i < n; ++i){
            if(arr[i].chars().distinct().count() > max){
                max = arr[i].chars().distinct().count();
                st = arr[i];
            }
        }
        System.out.println(st);
    }
}
