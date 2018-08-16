package uk.co.datadisk.sorting;

public class Main_Radix_Sort {

    public static void main(String[] args) {
        int[] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};
    }

    public static void displayArray(int[] input, String name) {
        System.out.print("Array " + name + " - ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("\n");
    }
}