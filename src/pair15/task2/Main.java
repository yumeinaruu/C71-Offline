package pair15.task2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Задача 2:
        //2.1 Создать двусвязный список стран мира.
        //2.2 Добавить к этому списку 4 страны ( 2 в начало и 2 в конец), вывести результат в
        //консоль (Использовать методы addFirst/addLast).
        //2.3 Удалить по одному элементу из начала и из конца списка.
        //2.4 Получить по одному элементу из начала и из конца списка.
        LinkedList<String> list = new LinkedList<>();
        list.add("UK");
        list.add("Turkey");
        list.addFirst("Belarus");
        list.addFirst("Russia");
        list.addLast("USA");
        list.addLast("Japan");
        list.removeFirst();
        list.removeLast();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
