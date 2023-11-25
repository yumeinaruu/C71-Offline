package pair14.test.Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User(1, 18, "testSubject");//айди не запишет потому что он трансиент
        FileOutputStream fileOutputStream = new FileOutputStream("subjectData.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        objectOutputStream.close();//можно трай вис ресорсес тогда не надо закрывать поток
        System.out.println(user);

        FileInputStream fileInputStream = new FileInputStream("subjectData.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User outUser = (User) objectInputStream.readObject();
        System.out.println(outUser);
    }
}
