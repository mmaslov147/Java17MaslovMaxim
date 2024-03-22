package lesson1.hw;

public class HWArray {
    public static void main(String[] args) {
        printOddNumbers();
    }

    public static int[] printOddNumbers() {
        int[] oddNumbers = new int[50];
        int index = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                oddNumbers[index] = i;
                index++;
            }
        }
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i]);
            if (i < oddNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        return oddNumbers;
    }
}
