package lesson11.hw;
/*В данном коде представлен класс Hamster, который является child классом класса Pet, а так же является моделью хомяка.
Он не содержит полей.
Содержит конструктор Hamster, который выводит на экран "I am a hamster and my name is " + name.
Так же содержит метод:
sleep(), который выводит на экран "Hamster is sleeping".
*/
public class Hamster extends Pet {
    protected Hamster(String name) {
        this.name = name;
        System.out.println("I am a hamster and my name is " + name);
    }
    void sleep(){
        System.out.println("Hamster is sleeping");
    }
}
