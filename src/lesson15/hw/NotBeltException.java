package lesson15.hw;
/*Второе пусть является дочерним классом класса Exception и называется NotBeltException. Также пусть передает
параметр String в конструктор super класса.*/
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
