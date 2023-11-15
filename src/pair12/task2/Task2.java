package pair12.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String text = "null";
        System.out.println(text.matches("null"));

        Pattern pattern = Pattern.compile("null");
        Matcher matcher = pattern.matcher("null");
        if(matcher.find()){
            System.out.println(matcher.matches());
        }
    }
}
