package pair10.cactus;

import lombok.ToString;

import java.util.Objects;

@ToString
public class Cactus implements Cloneable{
    public int cost = 100;
    public String color = "Green";

    /*@Override
    public String toString() {
        return "Cactus cost = " + cost;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cactus cactus = (Cactus) o;
        return cost == cactus.cost;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
