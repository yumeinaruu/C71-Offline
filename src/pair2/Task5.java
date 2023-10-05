package pair2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean k = true;
        while (k) {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
            System.out.println("Если вы хотите продолжить введите 1, если нет - 2: ");
            int check = scanner.nextInt();
            if (check == 1) {
                k = true;
            } else {
                k = false;
            }
        }
    }
}
