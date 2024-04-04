package lesson11.hw;
/*В данном коде представлен класс Main.
В методе main создаём объекты myDog и myHamster даём им название и выводим количество лап объекта Dog и
вызываем метод sleep класса Hamster.
*/
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Jimmi");
        Hamster myHamster = new Hamster("Grisha");

        System.out.println("Количество лап равно: " + myDog.paw);
        myHamster.sleep();
    }
}
