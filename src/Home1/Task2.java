package Home1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двузначное число: ");
        int number = scanner.nextInt();
        int firstDigit = number / 10;
        int secondDigit = number % 10;
        System.out.println("Первая цифра: " + firstDigit + "\t\tВторая цифра: " + secondDigit);
        System.out.println("Их сумма: " + (firstDigit+secondDigit));
    }
}
