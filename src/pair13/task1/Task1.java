package pair13.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        try {
            System.out.println(numbers[8]);
            numbers[1] = 2 / 0;
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Вы вышли за пределы массива или ошиблись в расчетах");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            System.out.println(e.getLocalizedMessage());
        } finally {
            System.out.println("блок финалли");
        }

        //try-with-resources
        try (FileReader fileReader = new FileReader("gkh")) {

        } catch (IOException e) {

        }
    }
}
