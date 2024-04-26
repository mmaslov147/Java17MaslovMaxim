package lesson16.hw;
/*Создать класс Car. Создать в нем поля: mark, age, color, owner.*/
public class Car {
    String mark;
    int age;
    String colour;
    Owner owner;

    public Car(String mark, int age, String colour, Owner owner){
        this.mark = mark;
        this.age = age;
        this.colour = colour;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                "mark='" + mark + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                ", owner=" + owner;
    }
}
