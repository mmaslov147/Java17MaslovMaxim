package lesson6.hw;

public class HWArray {
    public static void main(String[] args) {
        printOddNumbers();
    }

    public static int[] printOddNumbers() {
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
        return oddNumbers;
    }
}
