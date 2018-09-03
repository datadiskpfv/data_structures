package uk.co.datadisk.scratch;

import java.util.Arrays;

public class Main_Arrays_Class_1 {

    public static void main(String[] args) {

        int a1[] = {6,4,9,3,2,1};
        int a2[] = {1,2,3,4,6,9};
        String[] s1 = {"Paul", "Lorraine", "Dominic", "Jessica"};

        displayIntArray(a1);
        displayStringArray(s1);

        // binarySearch MUST have the array in Order, so sort first
        Arrays.sort(a1);
        System.out.println("3 found at index = " + Arrays.binarySearch(a1, 3));
        displayIntArray(a1);

        Arrays.sort(s1);
        System.out.println("Paul found at index = " + Arrays.binarySearch(s1, "Paul"));
        displayStringArray(s1);

        if(Arrays.hashCode(a1) == Arrays.hashCode(a2)){
            System.out.println("Hashcode of a1: " + Arrays.hashCode(a1) + " and hashcode of a2 is : " + Arrays.hashCode(a2));
        }

        if(Arrays.equals(a1, a2)){
            System.out.println("Arrays a1 and a2 are equal!!!");
        }

        System.out.println("toString of a1 array: " + Arrays.toString(a1));
    }

    private static void displayIntArray(int[]  input){
        System.out.println("-------------------------------------");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println();
    }

    private static void displayStringArray(String[]  input){
        System.out.println("-------------------------------------");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println();
    }
}