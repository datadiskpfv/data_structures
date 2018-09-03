package uk.co.datadisk.scratch;

public class Main_Arraylist_3 {

    public static void main(String[] args) {

        Employee1 emp1 = new Employee1("Paul", "Valle", 1000);
        Employee1 emp2 = new Employee1("Lorraine", "Valle", 1001);
        Employee1 emp3 = new Employee1("Dominic", "Valle", 1002);
        Employee1 emp4 = new Employee1("Jessica", "Valle", 1003);

        Employee1[] employees = new Employee1[5];

        employees[0] = emp3;
        employees[1] = emp2;
        employees[2] = emp1;
        employees[3] = emp4;

        displayArray(employees);
    }

    public static void displayArray(Employee1[] input){
        System.out.println("-------------------------------------");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println();
    }
}
