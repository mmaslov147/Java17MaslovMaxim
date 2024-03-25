package arraycontest.hw;

import java.util.Arrays;

public class ArrayContest3 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5};
        int[] result = powerIntArray(array);
        System.out.println(Arrays.toString(result));
    }

    //3. Дан массив целых чисел. Вернуть массив квадратов этих чисел.
    public static int[] powerIntArray(int[] array) {
        int[] arraySquare = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arraySquare[i] = array[i] * array[i];
        }
        return arraySquare;
    }
}
