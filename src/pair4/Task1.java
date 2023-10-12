package pair4;


import java.util.Arrays;
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


/*        String[] fruits = new String[4];
        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = scanner.nextLine();
        }
        System.out.println(fruits[1] + " " + fruits[2] + "\n" + fruits.length);
        fruits[2] = scanner.nextLine();
        System.out.println(fruits[2]);*/

/*        int[] nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)((Math.random() * 100));
        }

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        String lineArray = Arrays.toString(nums);
        System.out.println(lineArray);
        Arrays.sort(nums);

        String lineArray1 = Arrays.toString(nums);
        System.out.println(lineArray1);*/

/*        int[] nums = new int[5];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)((Math.random() * 100));
        }
        int[] secondNums = new int[10];
        secondNums = Arrays.copyOf(nums, nums.length);

        System.out.println(Arrays.toString(secondNums));

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums, 23));*/

        int len = scanner.nextInt();
        double[] masDouble = new double[len];

        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = (Math.random() * 100);
            System.out.println(masDouble[i]);
            if(masDouble[i] % 2 != 0){
                masDouble[i] = Math.pow(masDouble[i], 2);
            }
        }

        System.out.println(Arrays.toString(masDouble));

        System.out.print("\n[");

        for (int i = (masDouble.length - 1); i >= 0; i--) {
            System.out.print(masDouble[i] + " ");
        }
        System.out.println("]");
    }
}
