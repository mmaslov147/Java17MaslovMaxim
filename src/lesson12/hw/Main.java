package lesson12.hw;

/* Проверяем как всё работает */
public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport truck = new Truck();
        Transport plane = new Plane();

        car.calculateDistance(2000);
        plane.calculateDistance(15, 450);
        truck.printInfo();
        car.go();
    }
}
