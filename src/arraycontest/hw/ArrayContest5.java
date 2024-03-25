package arraycontest.hw;

import java.util.Arrays;

public class ArrayContest5 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{1, 2, 3};
        matrix[1] = new int[]{4, 5, 6};
        matrix[2] = new int[]{7, 8, 9};

        int[] result = biggestRowInMatrix(matrix);
        System.out.println("Строка с наибольшей суммой элементов: " + Arrays.toString(result));
    }

    // 5. Дана матрица целых чисел. Вернуть строку в матрице с наибольшей суммой элементов.
    public static int[] biggestRowInMatrix(int[][] matrix) {
        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
                maxRowIndex = i;
            }
        }
        return matrix[maxRowIndex];
    }

}

