package pair17.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //При помощи стримов из списка строк вывести только те, которые начинаются с буквы ‘A’
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Abcd");
        arrayList.add("ecd");
        arrayList.add("bcd");
        arrayList.add("Afffcd");
        arrayList.add("Afffcd");
        Optional<String> result = arrayList.stream().reduce((name, nextName) -> name + nextName);
        //long result = arrayList.stream().count();//возвращает количество элементов в стриме
                //.filter(text -> text.startsWith("A"))
                /*.distinct()//удаляет одинаковые
                .skip(1)
                .limit(3)//пропускает два первых, остальные нет(скип наоборот)
                .sorted(Comparator.comparing(String::length).reversed())//сортирует то что внутри
                .peek(name -> System.out.println("from stream: " + name))//что-то делает не изменяя элемент потока
                .map(String::toUpperCase)//изменяет элементы потока
                .flatMap((name) -> Arrays.stream(name.split("C")))
                .count();*/
                //.findAny();//возвращает рандомный элемент
                //.findFirst();//возвращает первый элемент, записать нужно(я сделал опшонал чтобы не было нуллпоинтера,вдруг все элементы отсортируются )
                //.forEach(System.out::println);//выводит все
        //List<String> result = arrayList.stream()
                //.collect(Collectors.toList());
        Boolean result1 = arrayList.stream().anyMatch(name -> name.length() > 3); // выдаст тру если хотя бы один будет соответствовать условию
        //allMatch выдаст тру если все соответствовать условию
        //noneMatch выдаст тру если все не соотв условию
        //max min с цифрами понятно
        //toArray сделает поток в массив из Object, надо явно преобразовать в то что нам надо

        System.out.println(result);
    }
}
