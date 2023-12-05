package pair17.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {
        //создание стрима из коллекции
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(-15);
        arrayList.add(20);

        arrayList.stream().filter((smth) -> smth > 0).forEach(System.out::println);





/*        //создание стрима из коллекции
        int[] array = new int[1000];
        Arrays.stream(array);

        //создание стрима из строки
        "assasassaas".chars();

        //создание стрима из обьектов
        //Stream.of(new User("sadsad"), new User("as"));*/


    }
}
