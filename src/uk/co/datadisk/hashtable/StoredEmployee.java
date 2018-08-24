package uk.co.datadisk.hashtable;

import uk.co.datadisk.linkedlist.Employee;

public class StoredEmployee {

  public String key;
  public Employee employee;

  public StoredEmployee(String key, Employee employee) {
    this.key = key;
    this.employee = employee;
  }
}
