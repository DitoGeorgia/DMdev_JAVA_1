import java.util.Scanner;

public class Lesson4Example {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        int value = new Scanner(System.in).nextInt();
        if (value > 0) {
            System.out.println("Число положительное");
        } else if (value < 0 ) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число \"0\"");
        }
    }
}
