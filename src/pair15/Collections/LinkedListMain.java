package pair15.Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Hello");
        list.add("World");
        list.add("c71");

        list.add(1, "test");

        System.out.println(list);

        list.set(1, "subject");
        list.remove(3);
        list.remove("World");
        System.out.println(list);
        list.add("World");
        list.add("c71");
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Hello"));
        System.out.println(list.size());

        System.out.println(list.get(3));

        list.sort(Comparator.comparing(String::length));
        System.out.println(list);
        String word = list.pop(); //возвращает первый элемент и удаляет, его можно записать
        // .poll - отдает и не удаляет .peek - тоже
        System.out.println(word);
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.peek());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
