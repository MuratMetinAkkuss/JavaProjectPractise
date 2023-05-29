package May08;

public class Student extends Person{
    private int number;
    private String studentClass;


    public Student(){

    }

    public Student(String name, String lastName, String idNumber, int perOld, int number, String studentClass) {
        super(name, lastName, idNumber, perOld);
        this.number = number;
        this.studentClass = studentClass;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "number=" + number +
                ", studentClass='" + studentClass + '\'' +
                '}';
    }
}
