package pair13.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Person person = new Person(scanner.nextInt());
        } catch (AgeException e) {
            System.out.println(e);
        }
    }
}
