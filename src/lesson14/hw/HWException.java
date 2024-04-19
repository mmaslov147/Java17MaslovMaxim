package lesson14.hw;

import java.util.Scanner;

/*Добавить в свои классы проверку и выкидывать исключения в случае ошибок.
Обработать исключения в try catch*/
public class HWException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("Размер массива должен быть положительным числом.");
                return;
            }

            int[] array = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            }

            int sum = 0;

            try {
                for (int j = 0; j <= array.length; j++) {
                    sum += array[j];
                }
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.err.println("Handle exception: " + exception.getMessage());
            }

            if (sum > 20) {
                System.out.println("Сумма элементов массива превысила 20");
            } else {
                System.out.println("Sum: " + sum);
            }
        } catch (Exception e) {
            System.out.println("Произошла ошибка ввода данных: " + e.getMessage());
        }
    }
}

