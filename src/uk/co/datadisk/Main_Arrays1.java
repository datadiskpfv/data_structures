package uk.co.datadisk;

public class Main_Arrays1 {

    public static void main(String[] args) {
        // Arrays are not dynamic, size is static
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
    }
}
