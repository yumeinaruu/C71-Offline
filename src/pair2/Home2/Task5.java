package pair2.Home2;

//Напишите программу, где пользователь вводит любое целое положительное число. А
//программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
//числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
//ввести некорректные данные.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        while(true){
            System.out.print("Введите число: ");
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
                break;
            } else{
                System.out.println("Введено неверное число. Попробуй снова");
            }
        }


        for(int i = 1; i <= num; i++){
            sum = sum + i;
        }
        System.out.println("Сумма всех чисел: " + sum);
    }
}
