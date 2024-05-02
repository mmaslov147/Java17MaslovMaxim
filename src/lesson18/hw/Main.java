package lesson18.hw;

import java.util.PriorityQueue;
import java.util.Queue;

/*Создать объект класса PriorityQueue интерфейса Queue типа String.
Добавить в него 5 значений. Каждое значение По Приоритету вывести и удалить.*/
public class Main {
    public static void main(String[] args) {
        Queue<Car> queue = new PriorityQueue<>();
        queue.add(Car.car1);
        queue.add(Car.car2);
        queue.add(Car.car3);
        queue.add(Car.car4);
        queue.add(Car.car5);
        System.out.println(queue);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
