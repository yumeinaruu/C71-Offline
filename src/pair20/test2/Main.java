package pair20.test2;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Concurrent - для работы с многопоточкой
        //1.Collections
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();//лучше хэштэйбл
        Hashtable<String, String> map1 = new Hashtable<>();//тот же конкарент но не оптимизированный
        //2.Lock обертка над синхронизатором, больше возможностей lock.lock()-бронирует потом lock.unlock()-разбронирует
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        //и еще куча
        //3. синхронизаторы - статья
        //4. Queues
        //5. Atomic точно гарантирует что что-то есть, либо все либо ничего
        //6. Executors (задачи)

        ReentrantLock lock1 = new ReentrantLock();
        lock1.lockInterruptibly();
        Thread t = new Thread();
        //interrupt
        t.start();
        t.interrupt(); //на метод реагируют только штуки из библиотеки Concurrrent, с обычными потоками не работает
        System.out.println(t.isInterrupted());

    }
}
