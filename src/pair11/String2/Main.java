package pair11.String2;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("First line");
        stringBuilder.append(" new line");
        stringBuilder.insert(5, "A");
        String str = stringBuilder.toString();
        //int a = Integer.parseInt(str); //не билдер потому что он не стринг
/*        System.out.println(stringBuilder);
        stringBuilder.deleteCharAt(4);
        System.out.println(stringBuilder);
        stringBuilder.delete(4, 6);
        stringBuilder.delete(0, 5);
        System.out.println(stringBuilder);
        stringBuilder.delete(4, 6);*/
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());

        StringBuffer stringBuffer = new StringBuffer();

    }
}
