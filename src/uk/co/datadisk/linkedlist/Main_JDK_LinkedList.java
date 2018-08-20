package uk.co.datadisk.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main_JDK_LinkedList {

  public static void main(String[] args) {

    Employee paul = new Employee("Paul", "Valle", 1000);
    Employee lorraine = new Employee("Lorraine", "Valle", 1001);
    Employee dominic = new Employee("Dominic", "Valle", 1002);
    Employee jessica = new Employee("Jessica", "Valle", 1003);

    LinkedList<Employee> list = new LinkedList<>();

    list.addFirst(paul);
    list.addFirst(lorraine);
    list.addFirst(dominic);
    list.add(jessica);        // add and addLast are the same, add to end of linkedlist

    printList(list);

//    for(Employee employee: linkedlist){
//      System.out.println(employee);
//    }

    list.removeFirst();   // remove and removeFirst are the same, remove from front of the linkedlist
    printList(list);

    list.removeLast();
    printList(list);

  }

  public static void printList(LinkedList list){

    Iterator iterator = list.iterator();

    System.out.println("HEAD -> ");
    while(iterator.hasNext()){
      System.out.print("  " + iterator.next());
      System.out.println(" <=> ");
    }
    System.out.println("null");

  }
}
