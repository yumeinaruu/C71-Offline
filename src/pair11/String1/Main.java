package pair11.String1;

import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String text = "My c71 group";

        System.out.println(text.length());

        System.out.println("Hello " + "world!");
        System.out.println("Hello ".concat("world!"));// не null!!!

        StringJoiner joiner = new StringJoiner("|||", "aaa", "bbb");
        System.out.println(joiner.add("adding").add("more"));

        char[] charArray = text.toCharArray();
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        System.out.println();
        String example = "BET1837 17DAQ T";
        System.out.println(example.charAt(14));
        System.out.println(example.indexOf("T"));
        System.out.println(example.lastIndexOf("T"));

        text = text.replace("c", "C");
        System.out.println(text);

        text = text.trim();//удаляет пробелы по краям
        System.out.println(text);

        System.out.println("helloHELLo".toLowerCase());
        System.out.println("helloHELLo".toUpperCase());

        String data = "1|  aaa|bbb";

        String[] result = data.split("\\|");// \\ - потому что спецсимвол
        System.out.println(Arrays.toString(result));
        for (String word : result) {
            System.out.println(word);
        }

        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());

        System.out.println(data.substring(2, 7).trim());

        System.out.println("abd".equals("abc"));//не учитывает регистр!!!
        System.out.println("abd".equalsIgnoreCase("abc"));//учитывает регистр!!!

        System.out.println("abc".compareToIgnoreCase("AB"));//сравнивает длину строки
        System.out.println(text.startsWith("My"));
        System.out.println(text.endsWith("oup"));
        System.out.println(text.contains(" "));

        System.out.println("Hello bye".regionMatches(0, "Hel", 0, 2));

    }
}
