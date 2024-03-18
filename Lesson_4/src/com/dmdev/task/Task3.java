package com.dmdev.task;

import java.util.Scanner;

/**
 * 3. Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
 * Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите сумму: ");
        int rubles = new Scanner(System.in).nextInt();
        int value = rubles % 10;
        int value2 = rubles % 100;
        if (value == 1 && value2 != 11) {
            System.out.println(rubles + " рубль");
        } else if ((value == 2 || value == 3 || value == 3)
                   && !(value2 == 12 || value2 == 13 || value2 == 14)) {
            System.out.println(rubles + " рубля");
        } else {
            System.out.println(rubles + " рублей");
        }
//        рубль  1, !11
//        рублей 5 - 19
//        рубля 2 - 4
//        if (rubles % 10 == 1 &&  rubles % 100 != 11) {
//            System.out.println(rubles + " рубль");
//        } else if ((rubles % 10 == 2 || rubles % 10 == 3 || rubles % 10 == 4)
//                   && (rubles % 100 != 12 || rubles % 100 != 13 || rubles % 100 != 14 )) {
//            System.out.println(rubles + " рубля");
//        } else {
//            System.out.println(rubles + " рублей");
//        }
    }
}
