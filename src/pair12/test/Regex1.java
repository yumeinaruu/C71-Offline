package pair12.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String name = "1234";
        System.out.println(name.matches("[\\d]{4}"));

        Pattern pattern = Pattern.compile("[0-9]{12}");


        Matcher matcher = pattern.matcher("Hello, my number is 375297450689");

        if(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
