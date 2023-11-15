package pair12.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//Написать метод который сможет вернуть все цифры из строки:
//“Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills”
        String text = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";
        Pattern pattern = Pattern.compile("@[A-z]+");
        Matcher matcher = pattern.matcher("Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        text = text.replaceAll("[A-z]", "&");
        System.out.println(text);

    }
}
