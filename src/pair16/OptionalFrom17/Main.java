package pair16.OptionalFrom17;

import java.util.Optional;
//помогает избежать нуллпоинтер эксепшн оборачивая значение в опшон

public class Main {
    public static void main(String[] args) throws Exception {
        String line = null;
        String val = "dfsf";
        String email = "dff@yandex.ru";

        //Optional<String> opt = Optional.empty();
        //Optional<String> opt1 = Optional.of(val);//сломается если там налл
        Optional<String> opt2 = Optional.ofNullable(line);//не сломается если налл

        if(opt2.isPresent()) {
            System.out.println(line.charAt(1));
        }

        opt2.ifPresent(val1 -> System.out.println(val1));
        System.out.println(opt2.orElse("bad"));


        //String result = opt2.orElseThrow();
        //String result2 = Optional.ofNullable(email).orElseThrow(() -> new Exception());
        boolean result3 = Optional.ofNullable(email).filter(value -> value.length()>5).isPresent();
        System.out.println(result3);
    }
}
