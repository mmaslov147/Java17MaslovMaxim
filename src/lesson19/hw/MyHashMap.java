package lesson19.hw;
/*Создать HashMap
Создайте HashMap, содержащий пары значений - имя игрушки (String) и объект игрушки (класс Toy(weight int, String color,
double price)).
Перебрать и распечатать пары значений - entrySet().
Перебрать и распечатать набор из имен продуктов - keySet().
Перебрать и распечатать значения продуктов - values().
Для каждого перебора создать свой метод. */
import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap<String, Toy> toyMap = new HashMap<>();

        toyMap.put("Юла", new Toy(500, "Жёлтый", 120.23));
        toyMap.put("Кукла", new Toy(150, "Розовый", 250.50));
        toyMap.put("Робот", new Toy(780, "Серый", 500));

        printEntries(toyMap);
        printKeys(toyMap);
        printValues(toyMap);
    }

    public static void printEntries(HashMap<String, Toy> map) {
        System.out.println("Печать пар значений:");
        for (Map.Entry<String, Toy> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println();
    }


    public static void printKeys(HashMap<String, Toy> map) {
        System.out.println("Печать набор из имени продуктов:");
        System.out.println(map.keySet());

    }


    public static void printValues(HashMap<String, Toy> map) {
        System.out.println("\nПечать значений продуктов:");
        System.out.println(map.values());

    }
}