package uk.co.datadisk.scratch.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main_LinkedHashSet_1 {

    public static void main(String[] args) {

        // A LinkedHashSet has input ordering
        // Not thread safe
        // No duplicates


        Employee3 emp1 = new Employee3("Paul", "Valle", 1000);
        Employee3 emp2 = new Employee3("Lorraine", "Valle", 1003);
        Employee3 emp3 = new Employee3("Dominic", "Valle", 1001);
        Employee3 emp4 = new Employee3("Jessica", "Valle", 1002);
        Employee3 emp5 = new Employee3("Will", "Hay", 1004);

        Set<Employee3> employees = new LinkedHashSet<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp1);        // No duplicates

        // will display the elements in the order that you added them in
        displayHashSet(employees);

       // all the usual methods are here contains, size, add, clear, etc, etc
    }

    private static void displayHashSet(Set<Employee3> input) {
        for (Employee3 emp : input) {
            System.out.print(emp + ", ");
        }
        System.out.println();
    }
}
