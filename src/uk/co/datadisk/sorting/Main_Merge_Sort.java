package uk.co.datadisk.sorting;

public class Main_Merge_Sort {

    public static void main(String[] args) {
        int[] bubbleArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(bubbleArray, 0, bubbleArray.length);

        displayArray(bubbleArray, "bubbleArray");
    }

    public static void mergeSort(int[] input, int start, int end){

        if( end - start < 2){
            return;
        }

        // get the middle of the array
        int mid = (start + end) / 2;
        System.out.println("MergeSort mid: " + mid);
        // left side of array
        System.out.println("mergeSort calling left side start: " + start +  " mid: " + mid);
        mergeSort(input, start, mid);
        // right side of the array
        System.out.println("mergeSort calling right side mid: " + mid + " end: " + end);
        mergeSort(input, mid, end);

        merge(input, start, mid, end);
    }

    public static void merge(int[] input, int start, int mid, int end){

        System.out.println("merge called........ start: " + start + " mid: " + mid + " end: " + end);

        if(input[mid - 1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        System.out.println("merge i: " + i + " j: " + j + " tempIndex: " + tempIndex);

        int[] temp = new int[end - start];
        while(i < mid && j < end){
            // <= makes it a stable array to handle duplicates
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
            displayArray(temp, "temp");
            System.out.println();
        }

        // src, srcPosition, dest, destPosition, length
        System.out.println("merge - input copy i: " + i + " destPos: " + (start + tempIndex) + " length: " + (mid - 1));
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        displayArray(input, "input");
        System.out.println();

        System.out.println("merge - temp copy start: " + start + " tempIndex: " + tempIndex);
        System.arraycopy(temp, 0, input, start,  tempIndex);
        displayArray(input, "input");
        System.out.println();
    }

    public static void displayArray(int[] input, String name){
        System.out.print("Array " + name + " - ");
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + " ");
        }
    }

}
