package uk.co.datadisk.linkedlist;

import java.util.List;
import java.util.Vector;

public class Main_Vector {

  public static void main(String[] args) {

    // VECTOR IS TREAD SAFE

    List<Employee> employeeList = new Vector<>();

    Employee paul = new Employee("Paul", "Valle", 1000);

    employeeList.add(paul);
    employeeList.add(new Employee("Lorraine", "Valle", 1001));
    employeeList.add(new Employee("Dominic", "Valle", 1002));
    employeeList.add(new Employee("Jessica", "Valle", 1003));

    employeeList.forEach(employee -> System.out.println(employee));

    System.out.println(employeeList.get(1));

    System.out.println(employeeList.isEmpty());

    employeeList.set(2, new Employee("Will", "Hay", 1004));
    employeeList.forEach(employee -> System.out.println(employee));
    System.out.println("Employee linkedlist size: " + employeeList.size());

    employeeList.add(2, new Employee("Dominic", "Valle", 1002));
    employeeList.forEach(employee -> System.out.println(employee));

    Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
    for(Employee employee: employeeArray){
      System.out.println(employee);
    }

    System.out.println(employeeList.contains(new Employee("Paul", "Valle", 1000)));

    System.out.println("Index of Lorraine: " + employeeList.indexOf(new Employee("Lorraine", "Valle", 1001)));

    employeeList.remove(3);
    employeeList.forEach(employee -> System.out.println(employee));
  }
}
