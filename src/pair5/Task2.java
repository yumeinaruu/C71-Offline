package pair5;

public class Task2 {
    public static void main(String[] args) {
        int[][][] array = {{{1, 23, 7}, {6, 13, 5}, {1, 5, 27, 4}}, {{1, 23, 7}, {6, 13, 5}, {1, 5, 27, 4}}, {{1, 23, 7}, {6, 13, 5}, {1, 5, 27, 4}}};
        int count = 0;
        for (int[][] ints : array) {
            for (int[] anInt : ints) {
                for (int k : anInt) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
