package lesson12.hw;
/* Переопределяем метод printInfo() и go() в трех разных подклассах.
Например: Car, Truck, Plane ... extends Transport */
public class Truck extends Transport{

    @Override
    public void printInfo() {
        System.out.println("This is Truck");
    }

    @Override
    public void go() {
        System.out.println("Truck is going");
    }
}
