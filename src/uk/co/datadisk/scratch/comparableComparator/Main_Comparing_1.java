package uk.co.datadisk.scratch.comparableComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main_Comparing_1 {

    public static void main(String[] args) {

        Employee4 emp1 = new Employee4("Paul", "Valle", 1000);
        Employee4 emp2 = new Employee4("Lorraine", "Valle", 1003);
        Employee4 emp3 = new Employee4("Dominic", "Valle", 1001);
        Employee4 emp4 = new Employee4("Jessica", "Valle", 1002);
        Employee4 emp5 = new Employee4("Paul", "Newman", 1004);

        // Try to use the List class as it make it easy to swap to use a different List type (ArrayList or LinkedList)
        List<Employee4> ll1 = new LinkedList<>();

        ll1.add(emp1);
        ll1.add(emp2);
        ll1.add(emp3);
        ll1.add(emp4);
        ll1.add(emp5);
        displayList(ll1);

        // SORT by ID using a Static Comparator
        ll1.sort(Employee4.employeeIDComparator);
        displayList(ll1);

        // SORT by First Name using a Static Comparator
        ll1.sort(Employee4.employeeFirstNameComparator);
        displayList(ll1);

        // SORT by ID using a Static Comparator (refactored to use a Comparator)
        ll1.sort(Employee4.employeeIDComparatorComparator);
        displayList(ll1);

        // SORT by ID using a Comparator Class for Employee4
        ll1.sort(new EmployeeComparatorID());
        displayList(ll1);

        // SORT by First Name using a Comparator and LAMBDA's
        ll1.sort(Comparator.comparing(Employee4::getFirstName).thenComparing(Employee4::getId).reversed());
        displayList(ll1);

        // SORT by using Comparable in Employee4 (compareTo method in Employee4)
        Collections.sort(ll1);
        displayList(ll1);
    }

    private static void displayList(List<Employee4> input) {

        // This is known as an external iterator
        for (Employee4 emp: input) {
            System.out.print(emp + ", ");
        }
        System.out.println();
    }

}
