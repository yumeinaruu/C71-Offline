package pair19.test2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begins");
        Thread myThread = new Thread(new SecondThread());
        myThread.start();
        //Thread.sleep(1000);//засыпает на миллисекунды
        myThread.join();//ждет пока не закончится поток, который мейн вызывает
        System.out.println("Main ends");
    }
}
