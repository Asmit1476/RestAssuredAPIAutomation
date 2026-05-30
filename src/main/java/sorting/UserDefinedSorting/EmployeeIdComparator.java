package sorting.UserDefinedSorting;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        //Ascending order
        return o1.getEmployeeId() - o2.getEmployeeId();
        //Descending order
        // return o2.getEmployeeId() - o1.getEmployeeId();
    }
}


