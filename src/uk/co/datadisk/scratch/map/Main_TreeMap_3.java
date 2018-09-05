package uk.co.datadisk.scratch.map;

import java.util.Map;
import java.util.TreeMap;

public class Main_TreeMap_3 {

    public static void main(String[] args) {

        // based on a red-black tree (self-balancing binary search tree)
        // Can use a comparator to order the Map or Comparable interface in the key object
        // implementation provides guaranteed log(n) time cost for the containsKey, get, put and remove operations
        // Not thread safe
        // Iterators are fail-fast

        TreeMap<String, Integer> map1 = new TreeMap<>();

        map1.put("Paul", 50);
        map1.put("Lorraine", 46);
        map1.put("Dominic", 21);
        map1.put("Jessica", 18);

        // There are many different way to display a map
        displayMap(map1);
        displayMapLambda(map1);

        System.out.println("Lorraine is a key ? " + map1.containsKey("Lorraine"));
        System.out.println("age of 18 is a value ? " + map1.containsValue(18));

        System.out.println("Get Dominic's age " + map1.get("Dominic"));     // Returns the value
        System.out.println("Get Will's age " + map1.getOrDefault("Will", 100));     // returns the default value if key not found

        System.out.println("First key: " + map1.firstKey());
        System.out.println("First entry: " + map1.firstEntry());

        System.out.println("Last key: " + map1.lastKey());
        System.out.println("Last entry: " + map1.lastEntry());
    }

    public static void displayMap(Map<String, Integer> input){
        for (Map.Entry<String, Integer> map: input.entrySet()){
            System.out.print(map.getKey() + " - " + map.getValue() + ", ");
        }
        System.out.println();
    }

    public static void displayMapLambda(Map<String, Integer> input){
        input.forEach((name, age) -> System.out.print(name + " => " + age + ", "));
        System.out.println();
    }
}
