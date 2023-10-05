package Home1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число с дробной частью: ");
        double n = scanner.nextDouble();
        if((n*10)%10 > 4){
            n++;
        }
        System.out.println("Округленное число: " + (int)n);
    }
}