package uk.co.datadisk;

public class Main_Shell_Sort {

    private static int count = 0;

    public static void main(String[] args) {

        int[] bubbleArray = {20, 35, -15, 7, 55, 1, -22};

        for(int gap = bubbleArray.length / 2; gap > 0; gap /= 2){

            // this is insertion sort but using gap
            for (int i = gap; i < bubbleArray.length; i++){
                int newElement = bubbleArray[i];

                int j = i;

                while(j >= gap && bubbleArray[j - gap] > newElement){
                    count++;
                    System.out.println("GAP (inside): " + gap + " Count: " + count);
                    bubbleArray[j] = bubbleArray[j - gap];
                    j -= gap;
                }
                count++;
                System.out.println("GAP (outside): " + gap + " Count: " + count);
                bubbleArray[j] = newElement;
            }
        }


        for(int i = 0; i < bubbleArray.length -1; i++){
            System.out.println(bubbleArray[i]);
        }
        System.out.println("Count: " + count);

    }
}