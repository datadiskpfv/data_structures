package uk.co.datadisk.scratch.map;

import java.util.HashMap;
import java.util.Map;

public class Main_Map_1 {

    public static void main(String[] args) {

        // With HashMap you can use a Key/Value pair
        // Either the Key or the Value can be an object
        // There is no ordering using a HashMap
        // Retrieval is fast as its o(1) constant time (using get or containsKey)
        // Can use null for either key or value
        // HashMap is not tread safe
        // Iterators are fail-fast (so not concurrent)

        Map<String, Integer> map1 = new HashMap<>();

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
