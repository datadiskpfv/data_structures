package uk.co.datadisk.scratch.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main_Map_2 {

    public static void main(String[] args) {

        // With HashMap you can use a Key/Value pair
        // Either the Key or the Value can be an object
        // There is no ordering using a HashMap
        // Retrieval is fast as its o(1) constant time (using get or containsKey)
        // Can use null for either key or value
        // HashMap is not tread safe
        // Iterators are fail-fast (so not concurrent)

        PersonKey p1 = new PersonKey("Paul", "Valle");
        PersonKey p2 = new PersonKey("Lorraine", "Valle");
        PersonKey p3 = new PersonKey("Dominic", "Valley");
        PersonKey p4 = new PersonKey("Jessica", "Valle");
        PersonKey p5 = new PersonKey("Will", "Hay");
        PersonKey p6 = new PersonKey("Graham", "Moffatt");
        PersonKey p7 = new PersonKey("Moore", "Marriott");

        Map<PersonKey, Integer> map1 = new HashMap<>();

        map1.put(p1, 50);
        map1.put(p2, 46);
        map1.put(p3, 21);
        map1.put(p4, 18);
        map1.put(p5, 86);
        map1.put(p6, 81);
        map1.put(p7, 73);
        displayMapLambda(map1);

        // to sort a HashMap create a TreeMap and use the comparable compareTo method to sort
        TreeMap treeMap1 = new TreeMap(map1);
        displayMapLambda(treeMap1);
    }

    private static void displayMapLambda(Map<PersonKey, Integer> input){
        input.forEach((personKey, age) -> System.out.print(personKey.getFirstName() + " " + personKey.getLastName() + " => " + age + ", "));
        System.out.println();
    }
}
