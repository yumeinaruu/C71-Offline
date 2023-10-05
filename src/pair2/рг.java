package pair2;

import java.util.Scanner;

public class рг {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();


        String str = switch (k){
            case 1 -> "lol";
            case 2 -> "dff";
            default -> "not bro";
        };

        System.out.println(str);
    }
}
