package uk.co.datadisk;

public class Main_Selection_Sort {

    // Uses less swaps than bubble sort

    private static int count = 0;

    public static void main(String[] args) {
        int[] bubbleArray = {20, 35, -15, 7, 55, 1, -22};

        for ( int lastUnsortedIndex = bubbleArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest_element = 0;
            for( int i = 1; i <= lastUnsortedIndex; i++){
               if(bubbleArray[i] > bubbleArray[largest_element]) {
                   largest_element = i;
               }
            }
            swap(bubbleArray,largest_element, lastUnsortedIndex);
        }

        for(int i = 0; i < bubbleArray.length -1; i++){
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
