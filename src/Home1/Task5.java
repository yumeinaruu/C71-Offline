package Home1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число q: ");
        int q = scanner.nextInt();
        System.out.print("Введите натуральное число w: ");
        int w = scanner.nextInt();
        System.out.println(q + " / " + w + " = " + (q/w) + " и " + (q%w) + " в остатке");
    }
}
