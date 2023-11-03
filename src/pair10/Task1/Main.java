package pair10.Task1;

import pair10.cactus.Cactus;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person("Kolya", 12, 123, new Cat());
        Person person1 = (Person) person.clone();
        System.out.println(person.hashCode());
        person.cat.age = 17;
        System.out.println(person);
        System.out.println(person1);
    }
}