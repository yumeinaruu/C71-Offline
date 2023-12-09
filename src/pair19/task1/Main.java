package pair19.task1;

public class Main {
    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread(new Counter());
        Thread thread1 = new Thread(counterThread);
        Thread thread2 = new Thread(counterThread);
        Thread thread3 = new Thread(counterThread);
        Thread thread4 = new Thread(counterThread);
        Thread thread5 = new Thread(counterThread);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
