package pair5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[2][3];
        int temp = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(0, 1000);
                if(array[i][j] > temp){
                    temp = array[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(temp);
    }
}
