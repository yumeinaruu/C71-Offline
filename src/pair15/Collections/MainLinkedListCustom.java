package pair15.Collections;

public class MainLinkedListCustom {
    public static void main(String[] args) {
        //создание первой ноды
        NodeCustom head = new NodeCustom(31, null);
        //создали вторую ноду
        head.next = new NodeCustom(27, null);
        //третью
        head.next.next = new NodeCustom(234, null);

        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
}
