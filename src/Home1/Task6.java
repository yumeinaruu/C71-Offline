package Home1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.print("Новое первое число: " + a);
        System.out.println("\t\tНовое второе число: " + b);
    }
}
