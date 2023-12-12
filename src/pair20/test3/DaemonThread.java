package pair20.test3;

public class DaemonThread extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("Waiting...");
        }
    }
}
