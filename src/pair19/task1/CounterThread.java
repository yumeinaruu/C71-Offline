package pair19.task1;

public class CounterThread implements Runnable {
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Hello from thread");
        synchronized (counter) {
            counter.setCount(1);
            for (int i = 0; i < 4; i++) {
                System.out.println(counter.getCount());
                counter.increase();
            }
        }
    }
}
