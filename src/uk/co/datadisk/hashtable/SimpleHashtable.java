package uk.co.datadisk.hashtable;

import uk.co.datadisk.linkedlist.Employee;

public class SimpleHashtable {

  private Employee[] hashTable;

  public SimpleHashtable() {
    hashTable = new Employee[10];
  }

  private int hashKey(String key){
    return key.length() % hashTable.length;
  }

  public void put(String key, Employee employee){
    int hashedKey = hashKey(key);
    if (hashTable[hashedKey] != null){
      System.out.println("Sorry there is already and employee at position " + hashedKey);
    } else {
      hashTable[hashedKey] = employee;
    }
  }

  public Employee get(String key){
    int hashedKey = hashKey(key);
    return hashTable[hashedKey];
  }

  public void printHashtable() {
    for (int i = 0; i < hashTable.length; i++) {
      System.out.println(i + ": " + hashTable[i]);
    }
  }
}
