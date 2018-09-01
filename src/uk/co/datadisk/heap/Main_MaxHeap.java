package uk.co.datadisk.heap;

public class Main_MaxHeap {

    public static void main(String[] args) {

        // Only use heaps for MIN and MAX values, use something else for random deletes, etc

        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.insert(80);
        maxHeap.insert(75);
        maxHeap.insert(60);
        maxHeap.insert(68);
        maxHeap.insert(55);
        maxHeap.insert(40);
        maxHeap.insert(52);
        maxHeap.insert(67);

        System.out.println("Peek is " + maxHeap.peek());
        maxHeap.printHeap();

        //maxHeap.delete(1);
        //maxHeap.printHeap();

        //maxHeap.delete(5);
        //maxHeap.printHeap();

        //maxHeap.delete(0);
        //System.out.println("Peek is " + maxHeap.peek());
        //maxHeap.printHeap();

        System.out.println("----------------------");
        maxHeap.printHeap();
        maxHeap.sort();
        maxHeap.printHeap();
    }
}
