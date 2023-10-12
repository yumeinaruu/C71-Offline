package pair4;


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*        String number = "50";
        String number1 = "100";

        int newNumber = Integer.parseInt(number);
        int newNumber1 = Integer.parseInt(number1);

        System.out.println(newNumber1 + newNumber);

        String numberStr = String.valueOf(newNumber1);
        String numberStr2 = String.valueOf(newNumber);

        System.out.println(numberStr2 + numberStr);

        System.out.println(Math.random());*/
/*
        for(int i = 0; i < 5; i++){
            System.out.println((int)Math.round(Math.pow(Math.random() * 10, 2)));
        }*/
/*
        String[] array = new String[10];
        array[1] = "HJu";
        System.out.println(array[1]);*/


        String[] fruits = new String[4];
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = scanner.nextLine();
        }
        System.out.println(fruits[1] + " " + fruits[2] + "\n" + fruits.length);
        fruits[2] = scanner.nextLine();
        System.out.println(fruits[2]);
    }
}
