package com.dmdev.lesson4;

public class SwitchExample {
    public static void main(String[] args) {
//     byte, short, int, char, String, enum
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("value == 1");
                break;
            case 2:
                System.out.println("value == 2");
                break;
            case 3:
                System.out.println("value == 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("value == 4,5,6");
                break;
            default:
                System.out.println("Нет такого значения");
        }
    }
}
