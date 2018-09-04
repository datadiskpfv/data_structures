package uk.co.datadisk.scratch.list;

import java.util.ArrayList;
import java.util.List;

public class Main_ArrayList_1 {

    public static void main(String[] args) {

        // Arraylist can only be used by Objects (no primitive types)
        // Backed by a resizeable Array and can contain nulls
        // Growing Array the is done automatically but does take time, use ensureCapacity first for lots of adding
        // ArrayList is not synchronized, wrap using the Collections.synchronizedList or use Vector
        // ArrayLists can have duplicates

        // Try to use the List class as it make it easy to swap to use a different List type (ArrayList or LinkedList)
        List<Integer> a1 = new ArrayList<>();

        a1.add(5);
        a1.add(3);
        a1.add(2);
        a1.add(4);
        a1.add(1);

        long startTime = System.nanoTime();
        displayArray(a1);
        long endTime = System.nanoTime();
        System.out.println("Elapsed Time (for loop): " + (endTime - startTime));

        startTime = System.nanoTime();
        displayArrayLambda(a1);
        endTime = System.nanoTime();
        System.out.println("Elapsed Time (lambda): " + (endTime - startTime));

    }

    private static void displayArray(List<Integer> input) {

        // This is known as an external iterator
        for (Integer i: input) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    private static void displayArrayLambda(List<Integer> input){
        //input.forEach(System.out::print);         // unable to add extra string info, but useful to display numbers only

        // This is known as an internal iterator
        input.forEach(e -> System.out.print(e + ", "));
        System.out.println();
    }
}
