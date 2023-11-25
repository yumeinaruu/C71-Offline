package pair14.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainBytes {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("text.txt")) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e){
            System.out.println(e);
        }

        String ourResult = "Save me";

        try(FileOutputStream fileOutputStream = new FileOutputStream("text.txt", true)){ //тру чтобы не перезаписать файл
            // а добавить новое

            //create bytes
            byte[] resultBytes = ourResult.getBytes();

            //write bytes
            fileOutputStream.write(resultBytes);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
