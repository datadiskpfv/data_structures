package uk.co.datadisk.hashtable;

import uk.co.datadisk.linkedlist.Employee;

public class Main_Simple_Hashtable {

  public static void main(String[] args) {

    // This solution will produce collisions

    Employee paul = new Employee("Paul", "Valle", 1000);
    Employee lorraine = new Employee("Lorraine", "Valle", 1001);
    Employee dominic = new Employee("Dominic", "Valle", 1002);
    Employee jessica = new Employee("Jessica", "Valle", 1003);
    Employee will = new Employee("Will", "Hay", 1004);

    SimpleHashtable ht = new SimpleHashtable();

    ht.put("valle1", paul);
    ht.put("valle12", lorraine);
    ht.put("valle123", dominic);
    ht.put("valle234", jessica);
    ht.printHashtable();

    ht.put("hay", will);
    ht.printHashtable();

    System.out.println(ht.get("hay"));
  }
}
