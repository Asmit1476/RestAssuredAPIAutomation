package JavaConcepts.FilterRecords.UserDefined;

public class Employee {
    int id;
    String name;
    String department;
    int ctc;

    public Employee(int id, String name, String department, int ctc) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.ctc = ctc;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", ctc=" + ctc +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCtc() {
        return ctc;
    }

    public void setCtc(int ctc) {
        this.ctc = ctc;
    }


}
