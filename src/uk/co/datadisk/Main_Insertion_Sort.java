package uk.co.datadisk;

public class Main_Insertion_Sort {

    private static int count = 0;

    public static void main(String[] args) {

        int[] bubbleArray = {20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < bubbleArray.length; firstUnsortedIndex++){
           int newElement = bubbleArray[firstUnsortedIndex];

           int i;

           for(i = firstUnsortedIndex; i > 0 && bubbleArray[i - 1] > newElement; i--){
               count++;
               bubbleArray[i] = bubbleArray[i - 1];
           }
           count++;
           bubbleArray[i] = newElement;
        }

        for(int i = 0; i < bubbleArray.length -1; i++){
            System.out.println(bubbleArray[i]);
        }
        System.out.println("Count: " + count);
    }
}
