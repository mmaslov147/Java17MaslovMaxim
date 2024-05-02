package lesson18.hw;
/*Создать объект класса LinkedList интерфейса Queue типа String. Добавить в него 5 значений. Каждое
значение вывести и удалить без выброса исключения.*/

import java.util.LinkedList;
import java.util.Queue;


public class MyQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Grape");
        queue.add("Strawberry");
        queue.add("Pineapple");
        queue.add("Banana");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
