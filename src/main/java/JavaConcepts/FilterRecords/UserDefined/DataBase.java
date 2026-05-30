package JavaConcepts.FilterRecords.UserDefined;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static List<Employee> getEmployees(){

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(213,"Akash","Engineering",2000000));
        list.add(new Employee(212,"Aryan","Engineering",1000000));
        list.add(new Employee(211,"Sumit","Sales",500000));
        list.add(new Employee(210,"Amit","Product",200000));
        list.add(new Employee(209,"Nikhil","HR",400000));
        list.add(new Employee(208,"Sourav","Noc",700000));

        return list;

    }
}
