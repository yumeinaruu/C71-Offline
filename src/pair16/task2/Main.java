package pair16.task2;

public class Main {
    public static void main(String[] args) {
        //Создать интерфейс IShape с методом getSquare(int x, int y). Используя лямбда-
        //выражения, реализовать его для квадрата(a*b) и треугольника(0.5a*h)

        //При помощи лямбда выражения реализовать логику, при которой, если а < b, то вернуть
        //а. Если a > b, то вернуть b. Иначе вернуть 0.

        IShape square = (x, y) -> x*y;
        IShape triangle = (x, y) -> 0.5 * x * y;
        IShape compare = (x, y) -> {if(x<y){return x;}
        else if(x>y){return y;} else return 0;};

        System.out.println(square.getSquare(10, 10));
        System.out.println(triangle.getSquare(10,5));
        System.out.println((int)compare.getSquare(1,2));
        System.out.println((int)compare.getSquare(2,1));
        System.out.println((int)compare.getSquare(2,2));
    }
}
