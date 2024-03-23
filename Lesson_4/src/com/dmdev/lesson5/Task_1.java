package com.dmdev.lesson5;

/**
 * 1. Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.
 */

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int value = scanner.nextInt();
            System.out.println("Введите второё число: ");
            int value2 = scanner.nextInt();
            int result = getMax(value, value2);
            System.out.println("\nРезультат: " + result +"\n");
        }

    }

    public static int getMax(int firstValue, int secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        }
        return  secondValue;
    }
}
