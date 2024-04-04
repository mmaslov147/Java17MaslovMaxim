package lesson11.hw;
/*В данном коде представлен класс Animal, который является моделью животного.
Он содержит следующие поля:
eyes - количество глаз (тип byte).
Содержит конструктор Animal, который выводит на экран «I am Animal»
Так же содержит методы:
Метод eat(), который выводит на экран "Animal eats".
Метод drink(), который выводит на экран "Animal
drinks".
*/
public class Animal {
    protected byte eyes;

    protected Animal() {
        System.out.println("I am Animal");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }
}
