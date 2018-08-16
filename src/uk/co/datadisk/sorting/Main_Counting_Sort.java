package uk.co.datadisk.sorting;

public class Main_Counting_Sort {

    public static void main(String[] args) {

        int[] countArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(countArray, 1, 10);

        displayArray(countArray, "countArray");
    }

    public static void countingSort(int[] input, int min, int max){
        int[] countArray = new int[(max - min) + 1];

        for(int i = 0; i < input.length; i++){
            countArray[input[i] - min]++;
        }

        int j = 0;
        for(int i = min; i <= max; i++){
            while(countArray[i - min] > 0){
                input[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    public static void displayArray(int[] input, String name) {
        System.out.print("Array " + name + " - ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("\n");
    }
}
