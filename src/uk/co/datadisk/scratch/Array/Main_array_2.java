package uk.co.datadisk.scratch.Array;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Main_array_2 {

    public static void main(String[] args) {

        String[] cars = new String[5];

        cars[0] = "Ford";
        cars[1] = "Vauxhall";
        cars[2] = "Peugeot";
        cars[3] = "Kia";
        cars[4] = "BMW";

        displayArray(cars);

        // Sort the array and time it
        long startTime = System.nanoTime();
        Arrays.sort(cars);
        long endTime = System.nanoTime();
        System.out.println("Elapsed Time: " + (endTime - startTime));

        displayArray(cars);
    }

    private static void displayArray(String[] input){
        System.out.println("-------------------------------------");
        long startTime = System.nanoTime();
        //long startTime = System.currentTimeMillis();
        for (String anInput : input) {
            System.out.print(anInput + ", ");
        }
        long endTime = System.nanoTime();
        //long endTime = System.currentTimeMillis();
        //System.out.println("Start: " + startTime + " End: " + endTime);
        System.out.println("Elapsed Time: " + (endTime - startTime));
        //System.out.println("Elapsed Time: " + TimeUnit.NANOSECONDS.toSeconds(endTime - startTime));
        System.out.println();
    }
}
