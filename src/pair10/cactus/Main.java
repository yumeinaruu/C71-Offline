package pair10.cactus;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cactus cactus = new Cactus();
        Cactus cactus1 = new Cactus();
        System.out.println(cactus);
        System.out.println(cactus.equals(cactus1));
        System.out.println(cactus.hashCode());
        Cactus cactusClone = (Cactus) cactus.clone();
        cactus.color = "Red";
        System.out.println(cactusClone);
    }
}
