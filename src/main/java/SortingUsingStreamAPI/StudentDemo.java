package SortingUsingStreamAPI;

import java.lang.reflect.Array;
import java.util.*;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Asmit"));
        list.add(new Student("Rohit"));
        list.add(new Student("Gyan"));
        list.add(new Student("Aman"));

        System.out.println("Before Sorting");

        for (Student s :list){
            System.out.println("Student Name: "+s.getName());
        }

        Collections.sort(list,new StudentNameComparator());

        System.out.println("After Sorting");

        for (Student s :list){
            System.out.println("Student Name: "+s.getName());
        }

// Or use this way
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for(Student s: list){
            System.out.println("Changes: "+s.getName());
        }


        // Or use this way
        Collections.sort(list,(o1,o2)-> o1.getName().compareTo(o2.getName()));
        System.out.println(list);
        for (Student s: list){
            System.out.println("Students: "+s.getName());
        }
    }
}
