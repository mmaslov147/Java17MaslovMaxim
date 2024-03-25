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
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count1++;
            }
        }
        int[] arrayNums = new int[count1];
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                arrayNums[count2] = array[i];
                count2++;
            }

        }
        return arrayNums;
    }
}