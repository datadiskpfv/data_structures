package uk.co.datadisk.scratch.map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;

public class Main_MultiMap_1 {

    // MultiMap is is used when you need more than one value per key

    public static void main(String[] args) {

        Multimap<String, String> myMultimap = ArrayListMultimap.create();

        // Adding some key/value
        myMultimap.put("Fruits", "Banana");
        myMultimap.put("Fruits", "Apple");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Vegetables", "Carrot");

        // Getting the size
        int size = myMultimap.size();
        System.out.println(size);  // 4

        // Getting values
        Collection<String> fruits = myMultimap.get("Fruits");
        System.out.println("Fruits: " + fruits); // [Banana, Apple, Pear]

        Collection<String> vegetables = myMultimap.get("Vegetables");
        System.out.println("Vegetables: " + vegetables); // [Carrot]

        // Iterating over entire Multimap
        System.out.print("All Values: ");
        for(String value : myMultimap.values()) {
            System.out.print(value + ", ");
        }
        System.out.println();

        // Removing a single value
        myMultimap.remove("Fruits","Pear");
        System.out.println("Fruits after removal of pear: " + myMultimap.get("Fruits")); // [Banana, Pear]

        // Remove all values for a key
        myMultimap.removeAll("Fruits");
        System.out.println("Fruoits are removing everything: " + myMultimap.get("Fruits")); // [] (Empty Collection!)

    }
}
