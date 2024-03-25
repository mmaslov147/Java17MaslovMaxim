package arraycontest.hw;

import java.util.Arrays;

public class ArrayContest1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = filterIntArray(array);
        System.out.println(Arrays.toString(result));
    }

    // 1. Дан массив целых чисел. Вернуть массив только четных чисел.
    public static int[] filterIntArray(int[] array) {
        int evenList = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenList++;
            }
        }
        int[] arrayNums = new int[evenList];
        int countEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                arrayNums[countEvenNumbers] = array[i];
                countEvenNumbers++;
            }

        }
        return arrayNums;
    }
}