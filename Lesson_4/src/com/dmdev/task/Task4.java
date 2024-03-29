package com.dmdev.task;

import java.util.Scanner;

/**
 * 4. Написать программу, которая считывает год, введённый пользователем, и определяет,
 * является ли этот год високосным.
 * Год считается високосным, если он делится без остатка на 4. Однако, если год также делится на 100,
 * то этот год не високосный, за исключением годов, делящихся на 400.
 * Например:
 * 1992 - високосный
 * 1900 - не високосный
 * 2000 – високосный
 */
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите год: ");
        while (true) {
            int value = new Scanner(System.in).nextInt();
            if (value % 400 == 0 || (value % 100 != 0 && value % 4 == 0)) {
                System.out.println("Год высокосный");
            } else
                System.out.println("Год не высокосный");
        }
    }
}
