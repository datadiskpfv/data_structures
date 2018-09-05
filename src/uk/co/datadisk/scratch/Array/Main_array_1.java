package uk.co.datadisk.scratch.Array;

public class Main_array_1 {

    public static void main(String[] args) {

        int[] a1 = new int[5];

        a1[0] = 5;
        a1[1] = 7;
        a1[2] = 8;
        a1[3] = 9;
        a1[4] = 10;

        displayArray(a1);
        System.out.println(a1);

        int[] a2 = a1.clone();
        displayArray(a2);
        System.out.println(a2);

        int[] a3 = a1;
        displayArray(a3);
        System.out.println(a3);

        // Alternate way to create an array
        int[] a4 = new int[] {1, 2, 3, 4, 5};
        displayArray(a4);
    }

    public static void displayArray(int[] input){
        System.out.println("-------------------------------------");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println();
    }
}
