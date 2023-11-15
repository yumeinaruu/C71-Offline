package pair12.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        //5. В строке “Hello \n world \n !!!”
        // заменить \n на “” используя классы Pattern и Matcher.
        String text = "Hello \n world \n!!!";
        Pattern pattern = Pattern.compile("\n");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceAll(""));
    }
}
