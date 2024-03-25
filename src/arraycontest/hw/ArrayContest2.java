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
        int countOfWords = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("a")) {
                countOfWords++;
            }
        }
        String[] arrayString = new String[countOfWords];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("a")){
                arrayString[index] = array[i];
                index++;
            }

        }
        return arrayString;
    }
}
