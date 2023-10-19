package pair6;

public class Person {
    String fullName = "Finn";
    int age = 16;
    Dog dogName = new Dog("Jake");

    public Person(){

    }
    public  Person(String fullName, int age, Dog dogName){
        this.fullName = fullName;
        this.age = age;
        this.dogName = dogName;
    }



    void talk(String text){
        System.out.println(fullName + " talk " + text);
    }

    void walkWithDog(){
        System.out.println(fullName + " walk with his dog " + dogName.name);
    }
}

class Dog{
    String name;
    Dog(String name){
        this.name = name;
    }
}
