package uk.co.datadisk.scratch.list;

import java.util.Comparator;
import java.util.Objects;

public class Employee3 implements Comparable<Employee3>{

  private String firstName;
  private String lastName;
  private int id;

  public Employee3(String firstName, String lastName, int id) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return firstName + ' ' + lastName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee3 employee = (Employee3) o;
    return id == employee.id &&
        Objects.equals(firstName, employee.firstName) &&
        Objects.equals(lastName, employee.lastName);
  }

  @Override
  public int hashCode() {

    return Objects.hash(firstName, lastName, id);
  }

  @Override
  public int compareTo(Employee3 emp) {
    //let's sort the employee based on id in ascending order
    //returns a negative integer, zero, or a positive integer as this employee id
    //is less than, equal to, or greater than the specified object.
    //return (this.id - emp.id);

    // You can play around with the below to get the sorting algorithm you need
    return Comparator.comparing(Employee3::getId)
            //.thenComparing(Employee3::getFirstName)
            //.thenComparingInt(Employee3::getId)
            .compare(this, emp);
  }
}