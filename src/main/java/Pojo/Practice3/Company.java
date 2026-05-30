package Pojo.Practice3;

import java.util.List;

public class Company {
    private String company;
    private Location location;
    private List<Departments> departments;
    private RemotePolicy remotePolicy;
    private List<Employees> employees;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public RemotePolicy getRemotePolicy() {
        return remotePolicy;
    }

    public void setRemotePolicy(RemotePolicy remotePolicy) {
        this.remotePolicy = remotePolicy;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }


}
