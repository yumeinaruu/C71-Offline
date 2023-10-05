package pair2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean f = true;
        while (f) {
            System.out.println("Введите число: ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n > 25 && n < 100) {
                    System.out.println("Число " + n + " попадает в диапазон от 25 до 100");
                } else {
                    System.out.println("Число " + n + " не попадает в диапазон от 25 до 100");
                }
            } else {
                System.out.println("Вы ввели ерунду");
                break;
            }
            System.out.println("Если вы хотите продолжить введите 1, если нет - 2: ");
            int k = scanner.nextInt();
            switch (k) {
                case 1:
                    break;
                case 2:
                    f = false;
                    break;
                default:
                    System.out.println("Вы ввели неверное число");
                    f = false;
                    break;
            }
        }
    }
}