package pair16.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу для вывода на консоль названия дня недели по введенной дате
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        System.out.println(LocalDate.parse(time).getDayOfWeek());

        //Написать программу для вывода на экран дату следующего вторника
        LocalDate localDate = LocalDate.parse(time);
        while(localDate.getDayOfWeek() != DayOfWeek.TUESDAY){
            localDate = localDate.plusDays(1);
        }
        System.out.println(localDate);
    }
}
