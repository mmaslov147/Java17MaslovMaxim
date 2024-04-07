package lesson12.hw;
/* Переопределяем метод printInfo() и go() в трех разных подклассах.
Например: Car, Truck, Plane ... extends Transport */
public class Plane extends Transport{

    @Override
    public void printInfo() {
        System.out.println("This is Plane");
    }

    @Override
    public void go() {
        System.out.println("Plane is going");
    }
}
