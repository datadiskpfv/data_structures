package uk.co.datadisk.hashtable;

import uk.co.datadisk.linkedlist.Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main_hashtable_JDK {

  public static void main(String[] args) {

    Employee paul = new Employee("Paul", "Valle", 1000);
    Employee lorraine = new Employee("Lorraine", "Valle", 1001);
    Employee dominic = new Employee("Dominic", "Valle", 1002);
    Employee jessica = new Employee("Jessica", "Valle", 1003);

    Employee will = new Employee("Will", "Hay", 1004);

    Map<String, Employee> hashMap = new HashMap<>();
    hashMap.put("Paul", paul);
    hashMap.put("Lorraine", lorraine);
    hashMap.put("Dominic", dominic);
    hashMap.put("Jessica", jessica);

    System.out.println(hashMap.containsKey("Paul"));
    System.out.println(hashMap.containsValue(paul));

//    Iterator<Employee> iterator = hashMap.values().iterator();
//    while(iterator.hasNext()){
//      System.out.println(iterator.next());
//    }

    hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));

    // over write Paul key will will Employee
    hashMap.put("Paul", will);
    hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));

    // only overwrite if key is absent
    hashMap.putIfAbsent("Lorraine", will);  // the existing value will be returned
    hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));

    System.out.println("Dominic " + hashMap.get("Dominic"));
    System.out.println("Get no one " + hashMap.get("Darth"));

    System.out.println("Return a default if key not found " + hashMap.getOrDefault("Darth", jessica));

    System.out.println("Remove Paul " + hashMap.remove("Paul"));
    hashMap.forEach((k, v) -> System.out.println("Key = " + k + ", Employee = " + v));

  }
}
