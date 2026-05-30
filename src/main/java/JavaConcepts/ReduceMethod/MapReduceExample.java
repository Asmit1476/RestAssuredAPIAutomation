package JavaConcepts.ReduceMethod;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,6,8,3,2,4,9);

        List<String> word = Arrays.asList("CoreJava","AirIndia","Python");

        //Using Reduce method of Stream API
        Integer sum= numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum using Reduce method: "+sum);

        Integer sum1 = numbers.stream().mapToInt(i->i).sum();
        System.out.println("Sum without using Reduce method: "+sum1);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println("Sum using Method Reference : "+reduceSumWithMethodReference);

        Integer maxValue = numbers.stream().reduce(0,(a,b)->a > b?a:b);
        System.out.println("Max value is: "+maxValue);

        Integer maxValueWithMethodReference = numbers.stream().reduce(Integer::max).get();
        System.out.println("Max value using Reduce method reference: "+maxValueWithMethodReference);

        String s = word.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println("Word with max length is: "+s);

        //Print the average salary of the Employee of Grade A
        double averageSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee->employee.getSalary())
                .mapToDouble(i->i)
                .average().getAsDouble();
        System.out.println("Average salary of employee of Grade A is: "+averageSalary);

        //Print the sum of the salary of Grade A Employs
        double sumSalary = EmployeeDatabase.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee->employee.getSalary())
                .mapToDouble(i->i)
                .sum();
        System.out.println("Sum of the salary Grade A employ is: "+sumSalary);





    }
}
