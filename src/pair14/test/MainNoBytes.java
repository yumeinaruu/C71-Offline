package pair14.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainNoBytes {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("text.txt");
             FileReader fileReader = new FileReader("text.txt")) {
            fileWriter.append("Привет ");

            fileWriter.write("ryr");
            fileWriter.flush();// флаш подтверждает сохранение

            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
