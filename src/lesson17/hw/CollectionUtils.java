package lesson17.hw;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionUtils {
    public static void main(String[] args) {
        Collection<String> wordsWithDuplicate = List.of("арбуз", "банан", "ежевика", "вишня", "ежевика", "банан");
        Collection<String> wordsWithoutDuplicates = removeDuplicates(wordsWithDuplicate);
        System.out.println("Коллекция без дубликатов: " + wordsWithoutDuplicates);
    }
    public static <T> Collection<T> removeDuplicates(Collection<T> collection){
        return new HashSet<>(collection);
    }
}
