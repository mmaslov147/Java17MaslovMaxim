package lesson27.hw;

/*Создайте класс с двумя методами, один из которых увеличивает значение переменной на 1 (в цикле 5000 раз), а другой -
уменьшает значение переменной на 1 (в цикле 1000 раз). Оба метода должны использовать synchronized блоки, чтобы
избежать race condition (проверьте что изначальное значение изменилось на +4000).*/
public class Counter {
    private int value = 0;

    public void increment() {
        synchronized (this) {
            for (int i = 0; i < 5000; i++) {
                value++;
            }
        }
    }

    public void decrement() {
        synchronized (this) {
            for (int i = 0; i < 1000; i++) {
                value--;
            }
        }
        if (value == 4000) {
            System.out.println("Value is +4000");
        } else {
            System.err.println("Value isn't +4000");
        }
    }
}
