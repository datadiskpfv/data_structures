package uk.co.datadisk.scratch.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_ArrayList_2 {

    public static void main(String[] args) {

        // Arraylist can only be used by Objects (no primitive types)
        // Backed by a resizeable Array and can contain nulls
        // Growing the is done automatically but does take time, use ensureCapacity first for lots of adding
        // ArrayList is not synchronized, wrap using the Collections.synchronizedList or use Vector

        // Try to use the List class as it make it easy to swap to use a different List type (ArrayList or LinkedList)
        List<Integer> a1 = new ArrayList<>();

        // Create a synchronized list
        List<Integer> a2 = Collections.synchronizedList(new ArrayList<>());

        // adding an element, adds to end of list O(1)
        a1.add(5);
        a1.add(3);
        a1.add(2);
        a1.add(4);
        a1.add(1);

        a2.add(5);
        a2.add(3);
        a2.add(2);
        a2.add(4);
        a2.add(1);

        displayArray(a1);
        displayArray(a2);
        System.out.println();

        // To sort we can use the Collections Class
        Collections.sort(a1);
        Collections.sort(a2);
        displayArray(a1);
        displayArray(a2);
        System.out.println();

        // For searching we can use either Collection class or ArrayList methods O(n)
        System.out.println(" 3 found at index = " + Collections.binarySearch(a1, 3));
        System.out.println("Where is 4 located in ArrayList: " + a1.indexOf(4));

        // Lets see if ArrayList something
        System.out.println("Does Arraylist contain 3: " + a1.contains(3));

        // get is O(1) constant time, because you have to specify the index
        System.out.println("Use get: " + a1.get(0));
    }

    private static void displayArray(List<Integer> input) {

        // This is known as an external iterator
        for (Integer i: input) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

}
