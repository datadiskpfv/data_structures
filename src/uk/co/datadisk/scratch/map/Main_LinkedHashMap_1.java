package uk.co.datadisk.scratch.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main_LinkedHashMap_1 {

    public static void main(String[] args) {

        // Same as HashMap but order as you entered them

        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();

        map1.put("Paul", 16);
        map1.put("Lorraine", 46);
        map1.put("Dominic", 21);
        map1.put("Jessica", 18);
        map1.put("Paul", 50);           // over writes existing value of 16

        // The order will be as you entered them, but its not sorted, use a TreeMap for sorting
        displayMap(map1);

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
}
