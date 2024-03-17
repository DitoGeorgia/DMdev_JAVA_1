package com.dmdev.task;

import java.util.Scanner;

/**
 * 1. Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
 */
public class Task {
    public static void main(String[] args) {
        System.out.println("Введите месяц: например 1, 2, ......");
        int month = new Scanner(System.in).nextInt();

/*  Зима - 12, 1, 2
    Весна - 3, 4, 5
    Лето - 6, 7, 8
    Осень - 9, 10, 11
 */
//        if (month == 12 || month == 1 || month == 2) {
//            System.out.println("Зима");
//        } else  if (month == 3 || month == 4 || month == 5) {
//            System.out.println("Весна");
//        } else if (month == 6 || month == 7 || month == 8) {
//            System.out.println("Лето");
//        } else if (month == 9 || month == 10 || month == 11) {
//            System.out.println("Осень");
//        } else {
//            System.out.println("Месяц введён не корректно");
//        }
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else  if (month >= 3 && month <= 5) {
            System.out.println("Весна");
        } else if (month >= 6 && month <= 8 ) {
            System.out.println("Лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Месяц введён не корректно");
        }
    }
}
