package lesson15.hw;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("BMW", "Red", 0);
        try {
            myCar.drive(0);
        } catch (NotFuelException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        try {
            myCar.safetyBelt("Not Belt");
        } catch (NotBeltException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
