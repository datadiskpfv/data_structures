package uk.co.datadisk.list;

public class Main_Double_Linked_List {

  public static void main(String[] args) {

    Employee paul = new Employee("Paul", "Valle", 1000);
    Employee lorraine = new Employee("Lorraine", "Valle", 1001);
    Employee dominic = new Employee("Dominic", "Valle", 1002);
    Employee jessica = new Employee("Jessica", "Valle", 1003);

    Employee will = new Employee("Will", "Hay", 1004);

    EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();

    list.addToFront(paul);
    list.addToFront(lorraine);
    list.addToFront(dominic);
    list.addToFront(jessica);

    list.printList();


  }
}