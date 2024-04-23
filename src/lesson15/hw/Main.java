package lesson15.hw;
/*Создаём объект myCar и пробуем вывести exception, которые создали*/
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "Red", 0);
        try {
            myCar.drive(0);
            myCar.safetyBelt("Not Belt");
        } catch (NotFuelException | NotBeltException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
