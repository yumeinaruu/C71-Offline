package pair6;

public class PersonMain {
    public static void main(String[] args) {
        Person Finn = new Person();
        Person Kim = new Person("Kim", 23, new Dog("Jimmy"));
        Finn.talk("Hello, im finn");
        Finn.walkWithDog();
        Kim.talk("Hello, im Kim");
        Kim.walkWithDog();
    }
}
