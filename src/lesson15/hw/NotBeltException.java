package lesson15.hw;

public class NotBeltException extends Exception {
    public NotBeltException(String belt) {
        super(belt);
    }

    public NotBeltException() {

    }

    @Override
    public String getMessage() {
        return "Belt is not fastened";
    }
}
