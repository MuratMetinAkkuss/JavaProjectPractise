package May08;

public class Teacher extends Person{

    private String department;
    private int workNumber;

    public Teacher(){

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(int workNumber) {
        this.workNumber = workNumber;
    }

    public Teacher(String name, String lastName, String idNumber, int perOld, String department, int workNumber) {
        super(name, lastName, idNumber, perOld);
        this.department = department;
        this.workNumber = workNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString() +
                "department='" + department + '\'' +
                ", workNumber=" + workNumber +
                '}';
    }
}
