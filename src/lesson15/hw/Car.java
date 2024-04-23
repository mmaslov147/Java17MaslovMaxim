package lesson15.hw;

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
