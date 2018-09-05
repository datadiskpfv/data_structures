package uk.co.datadisk.scratch.map;

import java.util.*;

public class Main_HashMap_Convert_List {

    public static void main(String[] args) {

        PersonKey p1 = new PersonKey("Paul", "Valle");
        PersonKey p2 = new PersonKey("Lorraine", "Valle");
        PersonKey p3 = new PersonKey("Dominic", "Valley");
        PersonKey p4 = new PersonKey("Jessica", "Valle");

        // Lets use a PersonKey object as the key
        Map<PersonKey, Integer> map1 = new HashMap<>();

        map1.put(p1, 50);
        map1.put(p2, 46);
        map1.put(p3, 21);
        map1.put(p4, 18);

        List<Integer> list1 = new ArrayList<>(map1.values());
        displayArray(list1);
    }

    private static void displayArray(List<Integer> input) {

        // This is known as an external iterator
        for (Integer i: input) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
