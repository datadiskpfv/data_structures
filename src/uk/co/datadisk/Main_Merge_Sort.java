package uk.co.datadisk;

public class Main_Merge_Sort {

    public static void main(String[] args) {
        int[] bubbleArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(bubbleArray, 0, bubbleArray.length);

        for(int i = 0; i < bubbleArray.length; i++){
            System.out.println(bubbleArray[i]);
        }
    }

    public static void mergeSort(int[] input, int start, int end){

        if( end - start < 2){
            return;
        }

        // get the middle of the array
        int mid = (start + end) / 2;
        // left side of array
        mergeSort(input, start, mid);
        // right side of the array
        mergeSort(input, mid, end);

        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){

        if(input[mid - 1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end){
            // <= makes it a stable array to handle duplicates
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // src, srcPosition, dest, destPosition, length
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

}
