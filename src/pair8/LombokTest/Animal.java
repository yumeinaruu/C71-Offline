package pair8.LombokTest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor  // или для всего @data
public class Animal {
    private String name;
    private int age;
    private int countLap;
    private boolean tail;
    private  double weight;

}
