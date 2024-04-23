package lesson15.hw;
/*Первое исключение называется NotFuelException, является дочерним классом класса RuntimeException и в нем создайте
конструктор, который принимает 1 параметр int и передает его в конструктор super класса.*/
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
