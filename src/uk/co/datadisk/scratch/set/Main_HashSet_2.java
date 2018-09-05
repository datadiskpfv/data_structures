package uk.co.datadisk.scratch.set;

import java.util.HashSet;
import java.util.Set;

public class Main_HashSet_2 {

    public static void main(String[] args) {

        // Not thread safe
        // No duplicates


        Employee3 emp1 = new Employee3("Paul", "Valle", 1000);
        Employee3 emp2 = new Employee3("Lorraine", "Valle", 1003);
        Employee3 emp3 = new Employee3("Dominic", "Valle", 1001);
        Employee3 emp4 = new Employee3("Jessica", "Valle", 1002);
        Employee3 emp5 = new Employee3("Will", "Hay", 1004);

        Set<Employee3> employees = new HashSet<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp1);        // No duplicates

        displayHashSet(employees);

        System.out.println("emp1 hashcode: " + emp1.hashCode());
        System.out.println("emp2 hashcode: " + emp2.hashCode());
        System.out.println("emp3 hashcode: " + emp3.hashCode());
        System.out.println("emp4 hashcode: " + emp4.hashCode());
    }

    private static void displayHashSet(Set<Employee3> input) {
        for (Employee3 emp : input) {
            System.out.print(emp + ", ");
        }
        System.out.println();
    }
}
