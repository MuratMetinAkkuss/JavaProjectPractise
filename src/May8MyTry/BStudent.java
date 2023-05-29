package May8MyTry;

public class BStudent extends APerson{
    //numara, sınıf bilgileri

    private int classNumber;
    private String whichClass;

    public BStudent() {

    }
    public BStudent(String name, String lastName, String idNo, int perAge, int classNumber, String whichClass) {
        super(name, lastName, idNo, perAge);
        this.classNumber = classNumber;
        this.whichClass = whichClass;
    }

    @Override
    public String toString() {
        return "Student: " +super.toString() +
                " classNumber=" + classNumber +
                ", whichClass=" + whichClass ;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public String getWhichClass() {
        return whichClass;
    }

    public void setWhichClass(String whichClass) {
        this.whichClass = whichClass;
    }
}
