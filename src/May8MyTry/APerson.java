package May8MyTry;

public class APerson {
    //we make instance variable for Ad-Soyad,  kimlik No, yaş,

    private String name;
    private String lastName;
    private String idNo;
    private int perAge;

    public APerson(){

    }
    public APerson(String name, String lastName, String idNo, int perAge) {
        this.name = name;
        this.lastName = lastName;
        this.idNo = idNo;
        this.perAge = perAge;
    }

    @Override
    public String toString() {
        return
                "name= " + name  +
                ", lastName= " + lastName  +
                ", idNo='" + idNo  +
                ", perAge= " + perAge;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public int getPerAge() {
        return perAge;
    }

    public void setPerAge(int perAge) {
        this.perAge = perAge;
    }


}
