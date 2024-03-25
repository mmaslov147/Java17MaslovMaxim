package arraycontest.hw;

import java.util.Arrays;

public class ArrayContest2 {
    public static void main(String[] args) {
        String[] array = {"Java","Trouble","real"};
        String[] result = filterStringArray(array);
        System.out.println(Arrays.toString(result));
    }

    // 2. Дан массив строк. Вернуть массив строк содержащих букву a.
    public static String[] filterStringArray(String[] array) {
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("a")) {
                count1++;
            }
        }
        String[] arrayString = new String[count1];
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("a")){
                arrayString[count2] = array[i];
                count2++;
            }

        }
        return arrayString;
    }
}
