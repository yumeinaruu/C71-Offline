package pair16.API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        //Creating
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2018,2,10));
        LocalDate localDate = LocalDate.of(2018,2,20);
        System.out.println(localDate.minusDays(50).plusYears(100));
        System.out.println(localDate.minus(10, ChronoUnit.CENTURIES));

        LocalDate localDate1 = LocalDate.parse("2020-12-25");
        System.out.println(ChronoUnit.DAYS.between(localDate1,localDate));

        System.out.println(localDate.getDayOfWeek());

        System.out.println(LocalTime.now());

        System.out.println(LocalDateTime.now());


    }
}
