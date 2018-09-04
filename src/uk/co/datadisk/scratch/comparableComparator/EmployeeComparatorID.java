package uk.co.datadisk.scratch.comparableComparator;

import uk.co.datadisk.scratch.comparableComparator.Employee4;

import java.util.Comparator;

public class EmployeeComparatorID implements Comparator<Employee4> {

    @Override
    public int compare(Employee4 o1, Employee4 o2) {
        return o1.getId() - o2.getId();
    }
}