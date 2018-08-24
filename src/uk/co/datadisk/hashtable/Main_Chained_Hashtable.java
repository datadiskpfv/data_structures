package uk.co.datadisk.hashtable;

import uk.co.datadisk.linkedlist.Employee;

public class Main_Chained_Hashtable {

  public static void main(String[] args) {
    Employee paul = new Employee("Paul", "Valle", 1000);
    Employee lorraine = new Employee("Lorraine", "Valle", 1001);
    Employee dominic = new Employee("Dominic", "Valle", 1002);
    Employee jessica = new Employee("Jessica", "Valle", 1003);
    Employee will = new Employee("Will", "Hay", 1004);

    ChainedHashtable cht = new ChainedHashtable();
    cht.put("Paul", paul);
    cht.put("Lorraine", lorraine);
    cht.put("Dominic", dominic);
    cht.put("Jessica", jessica);
    cht.put("Will", will);

    cht.printHashtable();

//    System.out.println("Find Will " + cht.get("Will"));
//    System.out.println("Find Jessica " + cht.get("Jessica"));
//
//     cht.remove("Will");
//     cht.printHashtable();
  }


}
