package pair7.Fox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fox fox = new Fox(5);

        System.out.println(fox.getAge());
        fox.setAge(scanner.nextInt());
        System.out.println(fox.getAge());
    }
}
