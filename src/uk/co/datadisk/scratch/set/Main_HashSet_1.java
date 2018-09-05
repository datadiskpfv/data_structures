package uk.co.datadisk.scratch.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_HashSet_1 {

    public static void main(String[] args) {
        // Very quick way to create a SET
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,3,5,7,9));
        displayHashSet(set1);
    }

    private static void displayHashSet(Set<Integer> input) {
        for (Integer i : input) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}