package uk.co.datadisk.scratch.map;

import java.util.*;

public class Main_HashMap_Convert_Set {

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

        // Getting data out of Map's into Set's
        Set<Integer> list1 = new HashSet<>(map1.values());
        Set<Integer> list2 = new TreeSet<>(map1.values());
        Set<PersonKey> list3 = new TreeSet<>(map1.keySet());

        displayArray(list1);
        displayArray(list2);
        displayArrayPersonKey(list3);
    }

    private static void displayArray(Set<Integer> input) {
        for (Integer i: input) { System.out.print(i + ", "); }
        System.out.println();
    }

    private static void displayArrayPersonKey(Set<PersonKey> input) {
        for (PersonKey pk: input) {
            System.out.print(pk.getFirstName() + " " + pk.getLastName() + ", ");
        }
        System.out.println();
    }
}
