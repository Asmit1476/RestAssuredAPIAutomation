package SortingUsingStreamAPI;

import sorting.UserDefinedSorting.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
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

        //Java 8 feature to sort the employee in ascending order of its EmployeeId
        List<Employee> employeeList = list.stream().sorted((e1, e2)-> e1.getEmployeeId() - e2.getEmployeeId()).collect(Collectors.toList());

        System.out.println("After sorting the employee based on EmployeeId");

        for(Employee emp : employeeList){
            System.out.println("Employee Id: " +emp.getEmployeeId());
            System.out.println("Employee Name: " +emp.getEmployeeName());
            System.out.println("Employee Salary: " +emp.getEmployeeSalary());
        }

        //Java 8 feature to sort the employee in ascending order of its EmployeeId
        List<Employee> emplList = list.stream().sorted((e1, e2)-> e1.getEmployeeName().compareTo(e2.getEmployeeName())).collect(Collectors.toList());

        System.out.println("After sorting the employee based on EmployeeId");

        for(Employee emp : emplList){
            System.out.println("Employee Id: " +emp.getEmployeeId());
            System.out.println("Employee Name: " +emp.getEmployeeName());
            System.out.println("Employee Salary: " +emp.getEmployeeSalary());
        }
    }
}
