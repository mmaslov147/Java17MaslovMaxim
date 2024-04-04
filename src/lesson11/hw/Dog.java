package lesson11.hw;
/*В данном коде представлен класс Dog, который является child классом класса Pet, а так же является моделью собаки.
Он не содержит полей.
Содержит конструктор Dog, который выводит на экран "I am dog and my name is " + name.
Так же содержит метод:
play(), который выводит на экран "Dog plays".
*/
public class Dog extends Pet {
    protected Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is " + name);
    }

    void play() {
        System.out.println("Dog plays");
    }
}
