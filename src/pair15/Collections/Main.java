package pair15.Collections;

import pair9.Task2.Computer;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

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
        list.clear();
        System.out.println(list.isEmpty());
    }
}
