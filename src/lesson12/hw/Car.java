package lesson12.hw;
/* Переопределяем метод printInfo() и go() в трех разных подклассах.
Например: Car, Truck, Plane ... extends Transport */
public class Car extends Transport{

    @Override
    public void printInfo() {
        System.out.println("This is Car");
    }

    @Override
    public void go() {
        System.out.println("Car is going");
    }
}
