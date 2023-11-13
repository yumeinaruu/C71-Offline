package pair11.Task;

public class Task2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello world");
        System.out.println(stringBuilder);
        stringBuilder.append("xxxxx");
        System.out.println(stringBuilder);
        stringBuilder.insert(5, "y");
        System.out.println(stringBuilder);
        stringBuilder.delete(3, 6);
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        String str = stringBuilder.toString();
        System.out.println(str);
    }
}
