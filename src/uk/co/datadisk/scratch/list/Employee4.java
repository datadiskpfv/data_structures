package uk.co.datadisk.scratch.list;

import java.util.Comparator;
import java.util.Objects;

public class Employee4 implements Comparable<Employee4> {

    private String firstName;
    private String lastName;
    private int id;

    public Employee4(String firstName, String lastName, int id) {
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

    // equals and hashCode Used to Compare objects to see if they are the same object or have same contents
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee4 employee = (Employee4) o;
        return id == employee.id &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }

    // Used for Sorting Algorithms (the Comparable Interface)
    @Override
    public int compareTo(Employee4 emp) {
        //let's sort the employee based on id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        //return (this.id - emp.id);

        // You can play around with the below to get the sorting algorithm you need
        return Comparator.comparing(Employee4::getFirstName)
                //.thenComparing(Employee3::getFirstName)
                //.thenComparing(Employee3::getLastName)
                .compare(this, emp);                      // uses the equals and the hashcode
    }

    // Create Multiple Comparators to sort things differently

    public static Comparator<Employee4> employeeIDComparator = new Comparator<Employee4>() {
        public int compare(Employee4 o1, Employee4 o2) {
            return o1.getId() - o2.getId();
        }
    };

    // same as above but using Comparator
    static Comparator<Employee4> employeeIDComparatorComparator = Comparator.comparingInt(Employee4::getId);

    public static Comparator<Employee4> employeeFirstNameComparator = new Comparator<Employee4>() {
        public int compare(Employee4 o1, Employee4 o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    };

    // Same as above but using Comparator
    public static Comparator<Employee4> employeeFirstNameComparatorComparator = Comparator.comparing(Employee4::getFirstName);
}