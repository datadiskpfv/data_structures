package uk.co.datadisk.scratch.set;

import java.lang.reflect.Field;
import java.util.*;

public class Main_TreeSet_1 {

    public static void main(String[] args) {

        // A LinkedHashSet has input ordering
        // Not thread safe
        // No duplicates

        Employee3 emp1 = new Employee3("Paul", "Valle", 1000);
        Employee3 emp2 = new Employee3("Lorraine", "Valle", 1003);
        Employee3 emp3 = new Employee3("Dominic", "Valle", 1001);
        Employee3 emp4 = new Employee3("Jessica", "Valle", 1002);
        Employee3 emp5 = new Employee3("Will", "Hay", 1004);
        Employee3 emp6 = new Employee3("Graham", "Moffatt", 1006);
        Employee3 emp7 = new Employee3("Moore", "Marriott", 1007);

        Employee3 emp8 = new Employee3("Paul", "Newman", 1005);

        TreeSet<Employee3> employees = new TreeSet<>();

        // The Tree will change as the Tree is rebalanced
        //employees.add(emp1);
        employees.add(emp4);
        employees.add(emp7);
        System.out.println("Tree ROOT: " + getTreeRoot(employees));

        employees.add(emp1);
        employees.add(emp5);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp6);
        employees.add(emp1);
        System.out.println("Tree ROOT: " + getTreeRoot(employees));

        // will display the elements in the order that you added them in
        displayHashSet(employees);

        System.out.println("Get First element in Tree: " + employees.first());
        System.out.println("Get Last element in Tree: " + employees.last());

        // you can find out where a NEW element would be placed based on the compareTo (Employee3 Comparable), floor and ceiling also uses equal
        System.out.println("Get floor element of emp8: " + employees.floor(emp8));
        System.out.println("Get ceiling element of emp8: " + employees.ceiling(emp8));

        // higher and lower do not use equal
        System.out.println("Get lower element of emp4: " + employees.lower(emp4));
        System.out.println("Get higher element of emp4: " + employees.higher(emp4));

        // use a descending iterator
        Iterator<Employee3> employee3Iterator = employees.descendingIterator();
        while(employee3Iterator.hasNext()){
            System.out.println(employee3Iterator.next());
        }
    }

    private static void displayHashSet(Set<Employee3> input) {
        for (Employee3 emp : input) {
            System.out.print(emp + ", ");
        }
        System.out.println();
    }

    // If you really need to know the tree root
    @SuppressWarnings("unchecked")
    public static <E> E getTreeRoot(TreeSet<E> ts) {
        try {
            Field mField = TreeSet.class.getDeclaredField("m");
            mField.setAccessible(true);
            return getTreeRoot((TreeMap<E, Object>) mField.get(ts));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new IllegalStateException("Internals of TreeSet has changed", e);
        }
    }

    @SuppressWarnings("unchecked")
    public static <K,V> K getTreeRoot(TreeMap<K,V> tm) {
        try {
            Field rootField = TreeMap.class.getDeclaredField("root");
            rootField.setAccessible(true);
            Map.Entry<K,V> root = (Map.Entry<K,V>) rootField.get(tm);
            return (root == null ? null : root.getKey());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new IllegalStateException("Internals of TreeMap has changed", e);
        }
    }
}