package sorting.UserDefinedSorting;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        //Ascending order
        return o1.getEmployeeName().compareTo(o2.getEmployeeName());

        //Descending order
        // return o2.getEmployeeName().compareTo(o1.getEmployeeName());
    }
}
