package Home1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt(); //Ввод числа
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 100 % 10;
        System.out.println("Первая цифра: " + firstDigit + "\t\tВторая цифра: " + secondDigit + "\t\tТретья цифра: " + thirdDigit);
        System.out.println("Сумма цифр введенного числа: " + (firstDigit + secondDigit + thirdDigit));
    }
}
