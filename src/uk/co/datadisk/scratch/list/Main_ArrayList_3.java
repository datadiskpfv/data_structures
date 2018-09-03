package uk.co.datadisk.scratch.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main_ArrayList_3 {

    public static void main(String[] args) {

        Employee3 emp1 = new Employee3("Paul", "Valle", 1000);
        Employee3 emp2 = new Employee3("Lorraine", "Valle", 1003);
        Employee3 emp3 = new Employee3("Dominic", "Valle", 1001);
        Employee3 emp4 = new Employee3("Jessica", "Valle", 1002);

        List<Employee3> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        displayArray(employees);

        Collections.sort(employees);
        displayArray(employees);
    }

    private static void displayArray(List<Employee3> input) {

        // This is known as an external iterator
        for (Employee3 emp: input) {
            System.out.print(emp + ", ");
        }
        System.out.println();
    }
}
