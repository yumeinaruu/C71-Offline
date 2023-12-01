package pair16.FunctionalInterface;

import java.util.Scanner;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //описать лямбду
        Funnable outLambda = (x, y) -> x + y;
        Funnable minusLambda = (x, y) -> x - y;


        //использовать
        System.out.println(outLambda.calculate(10, 20));
        System.out.println(minusLambda.calculate(20, 10));

        UnaryOperator<String> uo = (line) -> line.toLowerCase();
        System.out.println(uo.apply("HellO"));

        BinaryOperator<Integer> bo = (a, b) -> a * b;
        System.out.println(bo.apply(10, 20));

        //принимает значения и возвращает тру или фолс
        Predicate<String> line = l -> l.startsWith("A");
        System.out.println(line.test("AHello"));

        //не возвращает значений
        Consumer<Integer> consumer = number -> System.out.println(number);
        consumer.accept(1332);

        //не принимает значений, только отдает
        Supplier<String> supplier = () -> {
            return scanner.nextLine();
        };
        String result = supplier.get();
        System.out.println(result);

        //Принимает значение в качестве аргумента
        //одного типа и возвращает значение другого типа.
        Function<String, Integer> function = val -> {
            return Integer.parseInt(val);
        };
        int newVal = function.apply("123");
        System.out.println(newVal);

    }
}
