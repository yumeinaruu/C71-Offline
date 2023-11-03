package pair10.Task1;

import java.util.Objects;

public class Person implements Cloneable{
    private String name = "Stas";
    public int age;
    private int salary;
    public Cat cat = new Cat();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && salary == person.salary && Objects.equals(name, person.name);
    }

    public Person(String name, int age, int salary, Cat cat) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.cat = cat;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person personClone = (Person) super.clone();
        personClone.cat = (Cat) this.cat.clone();
        return personClone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", cat= " + cat + '}';
    }

    @Override
    public int hashCode() {
        return (int) (18 + (name.hashCode() + age + salary));
    }
}

