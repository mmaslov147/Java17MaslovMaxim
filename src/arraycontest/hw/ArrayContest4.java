package arraycontest.hw;

import java.util.Arrays;

public class ArrayContest4 {
    public static void main(String[] args) {
        String[] stringArray = {"Hello World", "Java is great", "Programming is fun"};
        String wordToCheck = "world";
        System.out.println(checkWord(stringArray, wordToCheck));
    }

    // 4. Дан массив строк. Проверить содержится ли слово в массиве, игнорируя case.
    public static boolean checkWord(String[] array, String word) {
        String wordLower = word.toLowerCase();
        for (int i = 0; i < array.length; i++) {
            String stringLower = array[i].toLowerCase();
            if (Arrays.asList(stringLower.split(" ")).contains(wordLower)) {
                return true;
            }
        }
        return false;
    }

}
