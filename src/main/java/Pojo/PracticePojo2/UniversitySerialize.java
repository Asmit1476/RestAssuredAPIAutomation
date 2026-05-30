package Pojo.PracticePojo2;

import java.util.ArrayList;
import java.util.List;

public class UniversitySerialize {
    public static void main(String[] args) {
        University university = new University();
        university.setName("MNIT Jaipur");

        Location location = new Location();
        location.setCity("Jaipur");
        location.setState("Rajasthan");
        location.setZipcode(811214);

        university.setLocation(location);

        List<Departments> departments = new ArrayList<>();

        Departments departments1 = new Departments();
        departments1.setDepartment_id("EC");
        departments1.setName("Electronics");

        Head head = new Head();
        head.setName("Prof Tarun Varma");
        head.setPosition("Department Head");
        head.setEmail("tarunvarma@gmail.com");

        departments1.setHead(head);


        List<Courses> coursesList = new ArrayList<>();
        Courses courses = new Courses();
        courses.setCourse_id("EC101");
        courses.setName("Introduction to EDC");
        courses.setCredits(10);

        Professor professor = new Professor();
        professor.setName("Jay Shah");
        professor.setEmail("jay@gmail.com");

        List<String> office_hours = new ArrayList<>();
        office_hours.add("Monday 10am to 5pm");
        office_hours.add("Tuesday 2pm to 5pm");

        professor.setOffice_hours(office_hours);

        List<Students> students = new ArrayList<>();

        Students student1 = new Students();
        student1.setStudent_id("202401");
        student1.setName("Satendra Kumar");
        student1.setYear("First Year");

        Grades grades = new Grades();
        grades.setMidterm(89);
        grades.setFinalScore(95);

        student1.setGrades(grades);

        courses.setProfessor(professor);
        courses.setStudents(students);

        coursesList.add(courses);

        departments1.setCourses(coursesList);
        departments.add(departments1);

        university.setDepartments(departments);



    }
}
