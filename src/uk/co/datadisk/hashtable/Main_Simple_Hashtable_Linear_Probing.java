package uk.co.datadisk.hashtable;

import uk.co.datadisk.linkedlist.Employee;

public class Main_Simple_Hashtable_Linear_Probing {

  public static void main(String[] args) {

    // This solution will produce collisions

    Employee paul = new Employee("Paul", "Valle", 1000);
    Employee lorraine = new Employee("Lorraine", "Valle", 1001);
    Employee dominic = new Employee("Dominic", "Valle", 1002);
    Employee jessica = new Employee("Jessica", "Valle", 1003);
    Employee will = new Employee("Will", "Hay", 1004);

    Employee x = new Employee("x", "Hay", 1005);

    SimpleHashtableLinearProbing ht = new SimpleHashtableLinearProbing();

    ht.put("valle1", paul);
    ht.put("valle12", lorraine);
    ht.put("valle123", dominic);
    ht.put("valle234", jessica);
    ht.printHashtable();

    ht.put("hay", will);
    ht.printHashtable();

    System.out.println(ht.get("valle234"));

    ht.remove("valle12");
    ht.remove("valle123");
    ht.printHashtable();
    System.out.println("Find jessica: " + ht.get("valle234"));

  }
}
