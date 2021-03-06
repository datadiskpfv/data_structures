package uk.co.datadisk.hashtable;

import uk.co.datadisk.linkedlist.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

  private LinkedList<StoredEmployee>[] hashtable;

  public ChainedHashtable() {
    hashtable = new LinkedList[50];
    for (int i = 0; i < hashtable.length; i++) {
      hashtable[i] = new LinkedList<>();
    }
  }

  private int hashKey(String key) {
    // You can use different hashing algorithms to try and avoid collisions
    //return key.length() % hashtable.length;
    return Math.abs(key.hashCode() % hashtable.length);
    //return Math.abs((key.hashCode() + key.hashCode()) % hashtable.length);
  }

  public void put(String key, Employee employee){
    int hashedKey = hashKey(key);
    hashtable[hashedKey].add(new StoredEmployee(key, employee));
  }

  public Employee get(String key){
    int hashedKey = hashKey(key);
    ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();

    StoredEmployee employee;
    while(iterator.hasNext()){
      employee = iterator.next();
      if(employee.key.equals(key)){
        return employee.employee;
      }
    }

    return null;
  }

  public Employee remove(String key){
    int hashedKey = hashKey(key);
    ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();

    StoredEmployee employee = null;

    int index = -1;
    while(iterator.hasNext()){
      employee = iterator.next();
      index++;
      if(employee.key.equals(key)){
        break;
      }
    }

    if(employee == null){
      return  null;
    } else {
      hashtable[hashedKey].remove(index);
      return employee.employee;
    }
  }

  public void printHashtable() {
    for (int i = 0; i < hashtable.length; i++) {
      if(hashtable[i].isEmpty()){
        System.out.println("Position " + i + ": empty");
      } else {
        System.out.print("Position " + i + ": ");
        ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
        while(iterator.hasNext()){
          System.out.print(iterator.next().employee);
          System.out.print(" -> ");
        }
        System.out.println("null");
      }
    }
  }
}