package May8MyTry;

public class CTeacher extends APerson{
    //bölüm, ve sicil No bilgileri içermelidir.

    private String departman;
    private int workNumber;

    public CTeacher(){

    }
    public CTeacher(String departman, int workNumber) {
        this.departman = departman;
        this.workNumber = workNumber;
    }

    @Override
    public String toString() {
        return "CTeacher{" +super.toString()+
                "departman='" + departman + '\'' +
                ", workNumber=" + workNumber +
                '}';
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(int workNumber) {
        this.workNumber = workNumber;
    }
}
