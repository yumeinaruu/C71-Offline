package pair13.except;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyFirstException {
/*        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(100 / scanner.nextInt());
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("end");*/

        /*try {
            System.out.println("before");
            if(true){
                throw new IndexOutOfBoundsException();
            }
            System.out.println("after");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("end");

        throw new IndexOutOfBoundsException();*/

        Optional.ofNullable(null).orElse(null); //nullpointer exception

        throw new MyFirstException();
    }
}
