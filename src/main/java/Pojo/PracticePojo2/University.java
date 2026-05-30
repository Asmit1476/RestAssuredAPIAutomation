package Pojo.PracticePojo2;

import java.util.List;

public class University {
    private String name;
    private Location location;
    private List<Departments> departments;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    public List<Departments> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Departments> departments) {
        this.departments = departments;
    }

}
