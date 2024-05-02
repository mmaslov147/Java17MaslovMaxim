package lesson18.hw;

/*Создать класс Car. Добавить поля name и age. Имплементировать интерфейс Comparable и
переопределить метод compareTo так, чтобы наивысший приоритет был у минимального элемента.*/
public class Car implements Comparable<Car> {
    static Car car1 = new Car("BMW", 2010);
    static Car car2 = new Car("Mercedes-Benz", 2005);
    static Car car3 = new Car("Renault", 2009);
    static Car car4 = new Car("Opel", 2018);
    static Car car5 = new Car("Chevrolet", 2021);

    private String name;
    private int age;


    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Car other) {
        Car otherCar = (Car) other;
        return this.age - otherCar.age;
    }
}
