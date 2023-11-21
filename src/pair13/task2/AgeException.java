package pair13.task2;

public class AgeException extends Exception {
    @Override
    public String toString() {
        return "Age must be 18+";
    }
}
