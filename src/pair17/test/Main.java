package pair17.test;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String value = null;
        Optional<String> wrapper = Optional.ofNullable(value);
        if(wrapper.isPresent()){
            System.out.println(value.length());
            String result = wrapper.get();
        }

        String result1 = wrapper.orElse("NEW_VALUE");
        System.out.println(result1);
    }
}
