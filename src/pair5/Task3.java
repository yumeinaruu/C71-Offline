package pair5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][5];
        int temp = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(0, 10);
                if(i == j){
                    temp = temp + array[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(temp);
    }
}
