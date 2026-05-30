package sorting.UserDefinedSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(4, "Rohit",100000));
        list.add(new Employee(1, "Ranjit",150000));
        list.add(new Employee(2, "Abhinav",108000));
        list.add(new Employee(3, "Gyan",1045000));

        System.out.println("Initial Order");
        for(Employee emp : list){
            System.out.println("Employee Id: " +emp.getEmployeeId());
            System.out.println("Employee Name: " +emp.getEmployeeName());
            System.out.println("Employee Salary: " +emp.getEmployeeSalary());
        }

        //Sort the employee in ascending order of its EmployeeId-------------------------
        Collections.sort(list,new EmployeeIdComparator());
        System.out.println("After sorting the employee based on EmployeeId");

        for(Employee emp : list){
            System.out.println("Employee Id: " +emp.getEmployeeId());
            System.out.println("Employee Name: " +emp.getEmployeeName());
            System.out.println("Employee Salary: " +emp.getEmployeeSalary());
        }

        //Sort the employee in ascending order of its EmployeeName------------------------
        Collections.sort(list,new EmployeeNameComparator());

        System.out.println("After sorting the employee based on EmployeeName");

        for(Employee emp : list){
            System.out.println("Employee Id: " +emp.getEmployeeId());
            System.out.println("Employee Name: " +emp.getEmployeeName());
            System.out.println("Employee Salary: " +emp.getEmployeeSalary());
        }

    }
}
