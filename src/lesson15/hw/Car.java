package lesson15.hw;
/*Создать класс Car. Создать аттрибуты name, color и fuelLevel. Первый метод drive будет иметь тип данных void и
параметр int. Если данный параметр равен нулю, то пусть выбрасывается исключение NotFuelException. Второй метод
safetyBelt пусть принимает String и если в строке будет значение "Not Belt", то пусть выбрасывается NotBeltException.
Если нет, то пусть выводит сообщение "Car is running"*/
public class Car {
    private String name;
    private String colour;
    private int fuelLevel;

    public Car(String name, String colour, int fuelLevel) {
        this.name = name;
        this.colour = colour;
        this.fuelLevel = fuelLevel;
    }

    public void drive(int fuelLevel) throws NotFuelException{
        if (fuelLevel == 0) {
            throw new NotFuelException();
        }
    }

    public void safetyBelt(String beltStatus) throws NotBeltException {
        if (beltStatus.equals("Not Belt")) {
            throw new NotBeltException();
        }
        System.out.println("Car is running");
    }
}
