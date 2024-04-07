package lesson12.hw;
/* Проверяем как всё работает */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        Plane plane = new Plane();

        car.calculateDistance(2000);
        plane.calculateDistance(15, 450);
        truck.printInfo();
        car.go();
    }
}
