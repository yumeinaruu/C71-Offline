package pair6;

public class Calculator {
    double weight;
    double cost;
    String color;

    {
        System.out.println("Создается объект!");
    }
    public Calculator(double weight, double cost, String color){
        this.weight = weight;
        this.cost = cost;
        this.color = color;
    }

    double sum(double a, double b){
        return a+b;
    }
    double decrease(double a, double b){
        return a-b;
    }
    double division(double a, double b){
        return a/b;
    }
    double mulituply(double a, double b){
        return a*b;
    }
}
