package lesson12.hw;
/* Cоздаём абстрактный класс Transport и переопределите метод printInfo() и go() в трех разных подклассах.
Например: Car, Truck, Plane ... extends Transport */
public abstract class Transport {

    public abstract void printInfo();

    public abstract void go();

    public void calculateDistance(int dist) {
        System.out.println("Distance: " + dist + "km");
    }

    public void calculateDistance(int time, int speed) {
        int dist = time * speed;
        System.out.println("Distance: " + dist + "km");
    }

}
