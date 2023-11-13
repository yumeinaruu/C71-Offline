package pair11.Task;

public class Task1 {
    public static void main(String[] args) {
        //1
        System.out.println("world " + "hello");
        System.out.println("world ".concat("hello"));
        //2
        System.out.println("World".equals("world"));
        System.out.println("World".equalsIgnoreCase("world"));
        //3
        System.out.println("world".substring(3));
        //5
        System.out.println("world".indexOf("o"));
        //4
        System.out.println("world".length());
        //6
        String str = String.valueOf(true);
        System.out.println(str);
        //7
        System.out.println("WORLD".toLowerCase());
        //8
        String text = "abcd1as";
        text = text.replace('1', '%');
        System.out.println(text);
        //9
        String text1 = "    avddf   ";
        System.out.println(text1.trim());
        //10
        System.out.println(" ".isBlank());
        //11
        String del = "aaa,dddd,ccc";
        String[] delArray = del.split(",");
        for (String word: delArray) {
            System.out.println(word);
        }
    }
}
