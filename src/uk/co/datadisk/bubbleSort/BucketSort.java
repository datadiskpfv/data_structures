package uk.co.datadisk.bubbleSort;

import java.util.*;

public class BucketSort {

  public static void main(String[] args) {

    int[]  intArray = { 54, 46, 83, 66, 95, 92, 43};

    bucketSort(intArray);

    for (int i = 0; i < intArray.length; i++) {
      System.out.print(" " + intArray[i]);
    }
  }

  public static void bucketSort(int[] input){

    // make sure you use the List interface as it makes it easy to change the concrete List, see line 30, 31 and 32
    List<Integer>[] buckets = new List[10];

    // create an array foreach bucket
    for (int i = 0; i < buckets.length; i++) {

      // you can use either ArrayList or LinkedList
      //buckets[i] = new ArrayList<>();
      //buckets[i] = new LinkedList<>();
      buckets[i] = new Vector<>();
    }

    // put values in to the correct bucket
    for (int i = 0; i < input.length; i++) {
      buckets[hash(input[i])].add(input[i]);
    }

    // sort each bucket
    for (List bucket: buckets){
      Collections.sort(bucket);
    }

    // copy the sorted buckets in to the input array
    int j = 0;
    for (int i = 0; i < buckets.length; i++){
      for(int value: buckets[i]){
        input[j++] = value;
      }
    }
  }

  private static int hash(int value){
    return value / (int) 10;
  }
}
