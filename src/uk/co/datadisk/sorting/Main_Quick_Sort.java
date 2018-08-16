package uk.co.datadisk.sorting;

public class Main_Quick_Sort {

    public static void main(String[] args) {
        int[] bubbleArray = {20, 35, -15, 7, 55, 1, -22};

        displayArray(bubbleArray, "bubbleArray - Start");

        quickSort(bubbleArray, 0, bubbleArray.length);

        displayArray(bubbleArray, "bubbleArray");

    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }

    private static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // Empty loop body
            // looking from right to left (smaller elements)
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                System.out.println("Replacing " + input[i] + " with " + input[j]);
                input[i] = input[j];
                displayArray(input, "input");
            }

            // looking from left to right (larger elements)
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                System.out.println("Replacing " + input[j] + " with " + input[i]);
                input[j] = input[i];
                displayArray(input, "input");
            }
        }

        input[j] = pivot;
        displayArray(input, "input");
        System.out.println();
        return j;
    }

    public static void displayArray(int[] input, String name) {
        System.out.print("Array " + name + " - ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("\n");
    }
}
