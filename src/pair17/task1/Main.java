package pair17.task1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Создать класс User с полем name. В Main создать поле user типа User. Заранее мы не
        //знаем лежит там объект или отсутствует. Написать логику, которая будет выводить имя
        //пользователя если объект присутствует в user, либо ‘DEFAULT’ в противном случае.
        //Использовать класс Optional.
        User user = null;
        User user1 = new User("subject");

        Optional<User> optionalUser = Optional.ofNullable(user);
        Optional<User> optionalUser1 = Optional.ofNullable(user1);

        System.out.println(optionalUser.orElse(new User("DEFAULT")).getName());
        System.out.println(optionalUser1.orElse(new User("DEFAULT")).getName());
    }
}
