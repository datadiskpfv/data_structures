package uk.co.datadisk.scratch.map;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.List;

public class Main_MultiMap_1 {

    // MultiMap is is used when you need more than one value per key

    public static void main(String[] args) {

        // There are many MultiMap types: BIMap, ListMultimap, SetMultimap and SortedSetMultimap.

        // ListMultimap<String, String> multimap = ArrayListMultimap.create();
        // Multiset<Class> myMultiset = HashMultiset.create();
        // BiMap<String,String> myBiMap = HashBiMap.create();

        // Multimap<String, String> myMultimap = ArrayListMultimap.create();
        ListMultimap<String, String> myMultimap = ArrayListMultimap.create();

        // Adding some key/value
        myMultimap.put("Fruits", "Banana");
        myMultimap.put("Fruits", "Apple");
        myMultimap.put("Fruits", "Pear");
        myMultimap.put("Vegetables", "Carrot");
        myMultimap.put("Vegetables", "Potatoes");

        // Getting the size
        int size = myMultimap.size();
        System.out.println(size);  // 4

        // Getting values
        //Collection<String> fruits = myMultimap.get("Fruits");                 // used with Multimap
        List<String> fruits = myMultimap.get("Fruits");
        System.out.println("Fruits: " + fruits); // [Banana, Apple, Pear]

        // Collection<String> vegetables = myMultimap.get("Vegetables");        // used with Multimap
        List<String> vegetables = myMultimap.get("Vegetables");
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
        System.out.println("Fruits are removing everything: " + myMultimap.get("Fruits")); // [] (Empty Collection!)
    }
}
