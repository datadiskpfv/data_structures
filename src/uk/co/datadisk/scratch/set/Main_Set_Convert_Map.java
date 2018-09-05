package uk.co.datadisk.scratch.set;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main_Set_Convert_Map {

    // The Collectors class is ideal for converting, counting, joining, averaging, etc for LISTS, SETS and MAPS

    public static void main(String[] args) {

        Employee4 emp1 = new Employee4("Paul", "Valle", 1000);
        Employee4 emp2 = new Employee4("Lorraine", "Valle", 1001);
        Employee4 emp3 = new Employee4("Dominic", "Valle", 1002);
        Employee4 emp4 = new Employee4("Jessica", "Valle", 1003);

        Set<Employee4> employees = new HashSet<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        displayHashSet(employees);

        // Convert the set to a map, there are other constructors for toMap to specify the type of Map and how to convert
        Map<String, Employee4> map = employees.stream().collect(Collectors.toMap(Employee4::getKey, e -> e));
        displayMap(map);
    }

    private static void displayHashSet(Set<Employee4> input) {
        for (Employee4 emp : input) {
            System.out.print(emp + ", ");
        }
        System.out.println();
    }

    public static void displayMap(Map<String, Employee4> input){
        for (Map.Entry<String, Employee4> map: input.entrySet()){
            System.out.print(map.getKey() + " - " + map.getValue().getId() + ", ");
        }
        System.out.println();
    }
}
