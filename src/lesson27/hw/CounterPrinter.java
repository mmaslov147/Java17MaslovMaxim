package lesson27.hw;
/*Выводим в консоль итоговое значение*/
public class CounterPrinter {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread incrementThread = new Thread(counter::increment);
        Thread decrementThread = new Thread(counter::decrement);

        incrementThread.start();
        decrementThread.start();
    }
}
