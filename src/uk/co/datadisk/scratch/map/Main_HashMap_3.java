package uk.co.datadisk.scratch.map;

import java.util.*;

public class Main_HashMap_3 {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Paul", "Valle");
        Employee emp2 = new Employee("Lorraine", "Valle");
        Employee emp3 = new Employee("Dominic", "Valle");
        Employee emp4 = new Employee("Jessica", "Valle");
        Employee emp5 = new Employee("Will", "Hay");
        Employee emp6 = new Employee("Graham", "Moffatt");
        Employee emp7 = new Employee("Moore", "Marriot");
        Employee emp8 = new Employee("Arthur", "Askey");
        Employee emp9 = new Employee("Norman", "Wisdom");
        Employee emp10 = new Employee("Sid", "James");
        Employee emp11 = new Employee("Kenneth", "Williams");

        // Use a treeSet for Ordering
        Set<Employee> it = new TreeSet<>();
        it.add(emp1);
        it.add(emp2);
        it.add(emp3);
        it.add(emp4);

        Set<Employee> hr = new TreeSet<>();
        hr.add(emp5);
        hr.add(emp6);
        hr.add(emp7);
        hr.add(emp8);

        Set<Employee> finance = new TreeSet<>();
        finance.add(emp9);
        finance.add(emp10);
        finance.add(emp11);

        Map<String, Set<Employee>> departments = new HashMap<>();

        departments.put("IT", it);
        departments.put("HR", hr);
        departments.put("FINANCE", finance);

        displayCompany(departments);
    }

    private static void displayCompany(Map<String, Set<Employee>> input) {
        for (Map.Entry<String, Set<Employee>> map: input.entrySet()){
            System.out.println(map.getKey());
            for (Employee e : map.getValue()) {
                System.out.println("  - " + e.getFirstName() + " " + e.getLastName());
            }
        }
        System.out.println();
    }
}
