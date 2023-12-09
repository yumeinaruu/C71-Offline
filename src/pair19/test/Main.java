package pair19.test;

public class Main {
    public static void main(String[] args) {
        System.out.println("поток main начинает свое действие");
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("поток main завершает свое действие");
    }
}
