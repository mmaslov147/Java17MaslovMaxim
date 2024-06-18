package lesson27.hw;
/*Создайте класс с двумя потоками. Каждый поток должен вызывать один и тот же метод, который выводит на консоль квадрат
чисел от 1 до 10 */
public class SquareThreads {
    public synchronized void printSquares(){
        for (int i = 0; i <= 10; i++) {
            double x = Math.pow(i, 2);
            System.out.println(Thread.currentThread().getName() + ": " + x);
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
    }
}
