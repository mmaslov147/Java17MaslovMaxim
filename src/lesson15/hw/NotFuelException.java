package lesson15.hw;

public class NotFuelException extends RuntimeException {
    public NotFuelException(int fuel) {
        super(String.valueOf(fuel));
    }

    public NotFuelException() {

    }

    @Override
    public String getMessage() {
        return "Fuel shortage";
    }
}
