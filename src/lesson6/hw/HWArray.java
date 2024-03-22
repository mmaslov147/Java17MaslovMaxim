package lesson6.hw;
/*
* Создать метод, который сохраняет в массиве все нечетные числа и после этого печатает все элементы в одной строке от 0 до 100
* */
public class HWArray {
    public static void main(String[] args) {
        printOddNumbers();
    }

    public static void printOddNumbers() {
        int[] oddNumbers = new int[50];
        for (int i = 0, index = 0; i <= 100; i++, index++) {
            if (i % 2 != 0) {
                oddNumbers[index] = i;
            }
        }
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i]);
            if (i < oddNumbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
