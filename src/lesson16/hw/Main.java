package lesson16.hw;
/*В главном классе создать 5 объектов класса Car Создать ArrayList и использовать методы: add(), addAll(), set(),
 indexOf(), size(), contains(), get(), remove(), lastIndexOf(), isEmpty(), clear() для этих объектов*/
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        Owner owner1 = new Owner("Dima", 26, 6);
        Owner owner2 = new Owner("Vlad", 22, 3);
        Owner owner3 = new Owner("Maxim", 19, 2);
        Owner owner4 = new Owner("Alex", 29, 1);
        Owner owner5 = new Owner("John", 49, 20);

        Car car1 = new Car("BMW", 6, "Red", owner1);
        Car car2 = new Car("Mercedes Benz", 6, "Red", owner2);
        Car car3 = new Car("Alfa Romeo", 6, "Red", owner3);
        Car car4 = new Car("Volkswagen", 6, "Red", owner4);
        Car car5 = new Car("Vaz 2107", 6, "Red", owner5);

        out.println("\n1) Add car1 to list \"cars\":");
        cars.add(car1);
        printListWithIndex(cars);

        out.println("\n2) Create an empty list and add remaining cars to new list:");
        ArrayList<Car> someCars = new ArrayList<>();
        someCars.add(car2);
        someCars.add(car3);
        someCars.add(car4);
        someCars.add(car5);
        printListWithIndex(someCars);

        out.println("\n3) Add all content from list \"someCars\" to list \"cars\":");
        cars.addAll(someCars);
        printListWithIndex(cars);

        out.println("\n4) Replace the element at index 2:");
        cars.set(2, car4);
        printListWithIndex(cars);

        out.println("\n5) Index of car4: " + cars.indexOf(car4));

        out.println("\n5) Size of ArrayList: " + cars.size());

        out.println("\n6) ArrayList contains car1: " + cars.contains(car1));

        out.println("\n7) Remove car1: ");
        cars.remove(0);
        printListWithIndex(cars);

        out.println("\n7) Last index of car3: " + cars.lastIndexOf(car2));

        out.println("\n8) Is ArrayList empty: " + cars.isEmpty());

        out.println("\n9) Clear the list \"cars\"");
        cars.clear();
        printListWithIndex(cars);


    }
    public static <E> void printListWithIndex(List<E> list) {
        List<String> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            newList.add(i + ":" + list.get(i));
        }
        out.println(newList);
    }

}
