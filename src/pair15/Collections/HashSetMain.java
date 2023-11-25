package pair15.Collections;

import java.util.HashSet;

public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("one");
        set.add("two");
        set.add("two2");
        set.add("two3");
        set.add("two4");
        set.add("two5");
        System.out.println(set);
    }
}
