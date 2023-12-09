package pair19.test2;

public class SecondThread extends ABC implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<100;i++){
            System.out.println(i);
        }
    }
}
