package uk.co.datadisk.scratch.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main_PriorityQueue_1 {

    public static void main(String[] args) {

        // Ordering is natural ordering by default but you can use a Comparator
        // head of the queue is the least element
        // The only way to get the correct sorted order is to use poll or remove (gets the head element)
        // looping over the queue does not return any ordering
        // Allows duplicates
        // Not thread safe
        // contains is o(n) linear time

        Queue<String> que1 = new PriorityQueue<>();

        que1.offer("Paul");
        que1.offer("Lorraine");
        que1.offer("Dominic");
        que1.offer("Jessica");
        que1.offer("Will");
        //displayQueue(que1);

        que1.offer("Graham");
        que1.offer("Moore");
        que1.offer("Arthur");
        que1.offer("Paul");
        pollQueue(que1);            // null returned when you try to remove from empty queue
        //removeQueue(que1);        // exception throw when you try to remove from empty queue

        System.out.println("PEEK priorityQueue: " + que1.peek());
        System.out.println("Does the queue contain 5 ? " + que1.contains(5));
    }

    private static void pollQueue(Queue<String> input) {
        while (!input.isEmpty()) {
            System.out.print(input.poll() + ", ");
        }
        System.out.println();
    }

    private static void removeQueue(Queue<String> input) {
        while (!input.isEmpty()) {
            System.out.print(input.remove() + ", ");
        }
        System.out.println();
    }
}
