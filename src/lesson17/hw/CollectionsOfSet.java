package lesson17.hw;

import java.util.*;

public class CollectionsOfSet {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("арбуз");
        fruits.add("банан");
        fruits.add("вишня");
        fruits.add("груша");
        fruits.add("дыня");
        fruits.add("ежевика");
        fruits.add("женьшень");
        fruits.add("земляника");
        fruits.add("ирис");
        fruits.add("картофель");
        fruits.add("арбуз");

        System.out.println("Содержимое коллекции 1: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Set<String> fruits2 = new LinkedHashSet<>();
        fruits2.add("арбуз");
        fruits2.add("банан");
        fruits2.add("вишня");
        fruits2.add("груша");
        fruits2.add("дыня");
        fruits2.add("ежевика");
        fruits2.add("женьшень");
        fruits2.add("земляника");
        fruits2.add("ирис");
        fruits2.add("картофель");
        fruits2.add("арбуз");

        System.out.println("\nСодержимое коллекции 2: ");
        for (String fruit : fruits2) {
            System.out.println(fruit);
        }

        Set<String> fruits3 = new TreeSet<>();
        fruits3.add("арбуз");
        fruits3.add("банан");
        fruits3.add("вишня");
        fruits3.add("груша");
        fruits3.add("дыня");
        fruits3.add("ежевика");
        fruits3.add("женьшень");
        fruits3.add("земляника");
        fruits3.add("ирис");
        fruits3.add("картофель");
        fruits3.add("арбуз");

        System.out.println("\nСодержимое коллекции 3: ");
        for (String fruit : fruits3) {
            System.out.println(fruit);
        }


    }

}
