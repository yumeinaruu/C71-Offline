package pair15.Collections;

import java.util.Comparator;
import java.util.Stack;
import java.util.Vector;

public class StackCollections {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("two");
        stack.push("Three");
        stack.pop();
        System.out.println(stack);

        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(3);
        vector.add(2);
        vector.add(5);
        vector.add(4);

        vector.sort(Comparator.comparing(Integer::valueOf));
        System.out.println(vector);
    }
}
