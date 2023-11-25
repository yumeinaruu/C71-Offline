package pair14.task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Используя FileOutputStream и FileInputStream записать в файл tms.txt строку,
//введенную пользователем с консоли. Считать строку из файла tms.txt и вывести в
//консоль, заменив все пробелы на знак нижнего подчеркивания.
public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        try(FileOutputStream fileOutputStream = new FileOutputStream("tms.txt")){
            byte[] textBytes = text.getBytes();
            fileOutputStream.write(textBytes);
        } catch (IOException e){
            System.out.println(e);
        }

        StringBuilder stringBuilder = new StringBuilder();
        try(FileInputStream fileInputStream = new FileInputStream("tms.txt")){
            int i;
            while ((i = fileInputStream.read()) != -1){
                stringBuilder.append((char) i);
            }
        } catch (IOException e){
            System.out.println(e);
        }
        System.out.println(stringBuilder.toString().replaceAll(" ", "_"));
    }
}
