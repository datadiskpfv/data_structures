package uk.co.datadisk;

public class Main_Bubble_Sort {

    // Degrades the more elements you have

    private static int count = 0;

    public static void main(String[] args) {

        int[] bubbleArray = {20, 35, -15, 7, 55, 1, -22};
        int unsortedPartitionIndex = bubbleArray.length - 1;

        while(unsortedPartitionIndex != 0) {
            int tmp;
            for(int i = 0; i < unsortedPartitionIndex; i++){
                if(bubbleArray[i] > bubbleArray[i+1]){
                    swap(bubbleArray, i, i +1);
                }
            }
            unsortedPartitionIndex--;
        }

        for(int i = 0; i < bubbleArray.length; i++){
            System.out.println(bubbleArray[i]);
        }
        System.out.println("Count: " + count);
    }

    public static void swap(int[] array, int i, int j) {
        count++;
        int tmp;
        tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
