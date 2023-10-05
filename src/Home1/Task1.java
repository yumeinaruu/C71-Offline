package Home1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите b: ");
        double b = scanner.nextDouble(); //Ввод чисел
        System.out.print("Введите c: ");
        double c = scanner.nextDouble(); //Ввод чисел
        double a = 4 * (b + c - 1) / 2; //Формула
        System.out.println("\nРезультат = " + a); //Результат вычислений
    }
}