package lesson11.hw;
/*В данном коде представлен класс Pet, который является child классом класса Animal, а так же является моделью питомца.
Он содержит следующие поля:
name - имя питомца(тип String).
tail - количество хвостов(тип byte).
paw - количество лап(тип byte).
Содержит конструктор Pet, который выводит на экран "I am Pet".
Так же содержит методы:
run(), который выводит на экран "Pet runs".
jump(), который выводит на экран "Pet jumps".
*/
public class Pet extends Animal {
    protected String name;
    protected byte tail = 1;
    protected byte paw = 4;

    protected Pet() {
        System.out.println("I am Pet");
        this.eyes = 2;
    }

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }
}
