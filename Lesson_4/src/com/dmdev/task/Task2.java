package com.dmdev.task;
import java.util.Scanner;

/**
 *  2. Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value = new Scanner(System.in).nextInt();
        int testValue = value % 10;
        if (testValue == 3) {
            System.out.println("Последняя цифра числа является \"3\"");
        }
    }
}
