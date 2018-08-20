package uk.co.datadisk.list;

public class Main_Single_Linked_List {

  public static void main(String[] args) {

    Employee paul = new Employee("Paul", "Valle", 1000);
    Employee lorraine = new Employee("Lorraine", "Valle", 1001);
    Employee dominic = new Employee("Dominic", "Valle", 1002);
    Employee jessica = new Employee("Jessica", "Valle", 1003);

    EmployeeSingleLinkedList list = new EmployeeSingleLinkedList();
    list.addToFront(paul);
    list.addToFront(lorraine);
    list.addToFront(dominic);
    list.addToFront(jessica);

    System.out.println("Is linked list empty: " + list.isEmpty());
    System.out.println("Size of linked list: " + list.getSize());

    list.printList();

    list.removeFromFront();
    list.printList();

  }
}
