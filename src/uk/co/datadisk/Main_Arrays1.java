package uk.co.datadisk;

public class Main_Arrays1 {

    public static void main(String[] args) {

        // O(1) = retrieve with index
        // O(n) = retrieve without index
        // O(n) = add an element to full array
        // O(1) = add an element to end of an array
        // O(1) = insert or update an element at specific index
        // O(1) = delete an element by setting it to null
        // O(n) = delete an element by shifting elements

        // Arrays are not dynamic, size is static
        // every element in array is the same size depending on data type
        int[] myArray1 = new int[7];

        // arrays are zero base, so we have 0-6 indexes
        myArray1[0] = 20;
        myArray1[1] = 35;
        myArray1[2] = -15;
        myArray1[3] = 7;
        myArray1[4] = 55;
        myArray1[5] = 1;
        myArray1[6] = -22;

        System.out.println("Array myArray1 size is " + myArray1.length);

        for( int i = 0; i < myArray1.length; i++){
            System.out.println(myArray1[i]);
        }

        for( int i = 0; i < myArray1.length; i++){
            System.out.print(".");
            if(myArray1[i] == 7){
                System.out.println("\nWe have found 7 at index " + i);
                break;
            }
        }
    }
}
