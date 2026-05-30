package Pojo.PracticePojo2;

import java.util.List;

public class Professor {
    private String name;
    private String email;
    private List<String> office_hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getOffice_hours() {
        return office_hours;
    }

    public void setOffice_hours(List<String> office_hours) {
        this.office_hours = office_hours;
    }

}
