package uk.co.datadisk.scratch.list;

import java.util.LinkedList;
import java.util.List;

public class Main_LinkedList_1 {

    public static void main(String[] args) {

        // add adds to end of the linked list, push adds to top of the list
        // duplicates are allowed
        // linked lists are doubly linked (next, prev)

        Employee3 emp1 = new Employee3("Paul", "Valle", 1000);
        Employee3 emp2 = new Employee3("Lorraine", "Valle", 1003);
        Employee3 emp3 = new Employee3("Dominic", "Valle", 1001);
        Employee3 emp4 = new Employee3("Jessica", "Valle", 1002);
        Employee3 emp5 = new Employee3("Will", "Hay", 1004);

        // If you use List here you have to cast everything
        LinkedList<Employee3> employees = new LinkedList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        displayArray(employees);

        employees.offer(emp5);       // add = end, offer = end, push = top
        displayArray(employees);

        // peek - look at top of list but don't remove
        // poll - get and remove head of list
        // pop  - same as poll
        System.out.println("Employee at top of list is " + employees.peek());
        employees.pop();
        displayArray(employees);

        System.out.println(employees.get(2));       // O(n) remember its not an array so a for loop is used to get the element, uses >> to cut list in half to find quicker
    }

    private static void displayArray(List<Employee3> input) {

        // This is known as an external iterator
        for (Employee3 emp: input) {
            System.out.print(emp + ", ");
        }
        System.out.println();
    }

}
