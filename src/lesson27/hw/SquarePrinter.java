package lesson27.hw;
/*Выводим на консоль квадрат
чисел от 1 до 10 по порядку потоков*/
public class SquarePrinter {
    public static void main(String[] args) {
        SquareThreads printer = new SquareThreads();

        Thread thread1 = new Thread(printer::printSquares, "Thread 1");
        Thread thread2 = new Thread(printer::printSquares, "Thread 2");

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        thread2.start();
    }
}
