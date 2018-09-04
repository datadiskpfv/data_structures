package uk.co.datadisk.scratch.list;

import java.util.ArrayList;
import java.util.List;

public class Main_ArrayList_4 {

    public static void main(String[] args) {

        List<Integer> a1 = new ArrayList<>();

        a1.add(5);
        a1.add(3);
        a1.add(2);
        a1.add(4);
        a1.add(1);

        addElement(a1);
        displayArray(a1, "main");

    }

    private static void addElement(List<Integer> input) {

        input = new ArrayList<>();

        displayArray(input, "addElement");
    }

    private static void displayArray(List<Integer> input, String action) {

        // This is known as an external iterator
        System.out.print(action + " - ");
        for (Integer i: input) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
