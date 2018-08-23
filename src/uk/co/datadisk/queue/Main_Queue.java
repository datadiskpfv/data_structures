package uk.co.datadisk.queue;

import uk.co.datadisk.linkedlist.Employee;

public class Main_Queue {

  public static void main(String[] args) {

    Employee paul = new Employee("Paul", "Valle", 1000);
    Employee lorraine = new Employee("Lorraine", "Valle", 1001);
    Employee dominic = new Employee("Dominic", "Valle", 1002);
    Employee jessica = new Employee("Jessica", "Valle", 1003);
    Employee will = new Employee("Will", "Hay", 1004);

    Employee graham = new Employee("Graham", "Moffett", 1005);

    ArrayQueue queue = new ArrayQueue(10);

    queue.add(paul);
    queue.add(lorraine);
    queue.add(dominic);
    queue.add(jessica);

    queue.printQueue();

    System.out.println("Peeked: " + queue.peek());

    queue.remove();
    queue.remove();

    queue.printQueue();
  }
}
