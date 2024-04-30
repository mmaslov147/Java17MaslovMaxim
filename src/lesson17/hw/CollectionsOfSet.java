package lesson17.hw;

import java.util.*;

public class CollectionsOfSet {
    public static void printCollectionContents(Set<String> collection, String collectionName) {
        System.out.println("\nСодержимое " + collectionName + ":");
        for (String item : collection) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Set<String> fruits1 = new HashSet<>();
        fruits1.add("арбуз");
        fruits1.add("банан");
        fruits1.add("вишня");
        fruits1.add("груша");
        fruits1.add("дыня");
        fruits1.add("ежевика");
        fruits1.add("женьшень");
        fruits1.add("земляника");
        fruits1.add("ирис");
        fruits1.add("картофель");
        fruits1.add("арбуз");

        printCollectionContents(fruits1, "коллекции 1");

        Set<String> fruits2 = new LinkedHashSet<>();
        fruits2.addAll(fruits1);

        printCollectionContents(fruits2, "коллекции 2");

        Set<String> fruits3 = new TreeSet<>();
        fruits3.addAll(fruits1);

        printCollectionContents(fruits3, "коллекции 3");
    }
}

