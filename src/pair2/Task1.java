package pair2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1: {
                System.out.println("Январь");
                break;
            }
            case 2: {
                System.out.println("Февраль");
                break;
            }
            case 3: {
                System.out.println("Март");
                break;
            }
            case 4: {
                System.out.println("Апрель");
                break;
            }
            case 5: {
                System.out.println("Май");
                break;
            }
            case 6: {
                System.out.println("Июнь");
                break;
            }
            case 7: {
                System.out.println("Июль");
                break;
            }
            case 8: {
                System.out.println("Август");
                break;
            }
            case 9: {
                System.out.println("Сентябрь");
                break;
            }
            case 10: {
                System.out.println("Октябрь");
                break;
            }
            case 11: {
                System.out.println("Ноябрь");
                break;
            }
            case 12: {
                System.out.println("Декабрь");
                break;
            }
            default: {
                System.out.println("Нет такого месяца");
            }
        }

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }
        System.out.println("Hello git");
        System.out.println("Check my branch");
    }
}
