package pair13.task2;

import lombok.Getter;

@Getter
public class Person {
    private int age;

    public Person(int age) throws AgeException {
        this.age = age;
        if(this.age < 18){
            throw new AgeException();
        }
    }
}
