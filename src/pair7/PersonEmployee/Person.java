package pair7.PersonEmployee;

public class Person {
    String fullName;
    int age;

    void talk(String text){
        System.out.println(fullName + " says " + text + " ...");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
