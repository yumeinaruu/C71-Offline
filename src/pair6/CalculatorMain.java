package pair6;
import pair6.Calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(15, 10, "Blue");
        System.out.println("Сумма: " + calculator.sum(5, 6) + "\nВычитание: " + calculator.decrease(5, 6));
        System.out.println("Деление: " + calculator.division(5, 6) + "\nУмножение: " + calculator.mulituply(5, 6));
        System.out.println("Вес калькулятора: " + calculator.weight + "\nСтоимость калькулятора: " + calculator.cost);
        System.out.println("Цвет калькулятора: " + calculator.color);
    }
}
