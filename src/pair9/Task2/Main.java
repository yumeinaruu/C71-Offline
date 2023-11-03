package pair9.Task2;

public class Main {
    public static void main(String[] args) {
        Computer mac = new Mac();
        Computer hp = new Hp();
        mac.getComputerName();
        hp.getComputerName();
        System.gc();
    }
}
