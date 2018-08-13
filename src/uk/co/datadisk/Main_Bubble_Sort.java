package uk.co.datadisk;

public class Main_Bubble_Sort {

    public static void main(String[] args) {
        // Degrades the more elements you have

        int[] bubbleArray = {20, 35, -15, 7, 55, 1, -22};
        int unsortedPartitionIndex = 6;

        while(unsortedPartitionIndex != 0) {
            int tmp;
            for(int i = 0; i < unsortedPartitionIndex; i++){
                if(bubbleArray[i] > bubbleArray[i+1]){
                    System.out.println("Swap " + bubbleArray[i] + " with " + bubbleArray[i+1]);
                    tmp = bubbleArray[i+1];
                    bubbleArray[i+1] = bubbleArray[i];
                    bubbleArray[i] = tmp;
                }
            }
            unsortedPartitionIndex--;
        }

        for(int i = 0; i < bubbleArray.length; i++){
            System.out.println(bubbleArray[i]);
        }
    }

}
