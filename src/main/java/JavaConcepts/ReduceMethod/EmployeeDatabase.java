package JavaConcepts.ReduceMethod;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {
    public static List<Employee> getEmployees(){
        return Stream.of(
                new Employee(104,"Rohit","A",100000),
                new Employee(101,"Abhinav","B",200000),
                new Employee(103,"Akash","A",300000),
                new Employee(102,"Mohit","A",150000),
                new Employee(105,"Ajay","C",150000)
        ).collect(Collectors.toList());

    }
}
