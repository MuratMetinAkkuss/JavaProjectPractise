package May08;

public class Person {

    private String name;
    private String lastName;
    private String idNumber;
    private int perOld;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getPerOld() {
        return perOld;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setPerOld(int perOld) {
        this.perOld = perOld;
    }

    public Person(String name, String lastName, String idNumber, int perOld) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.perOld = perOld;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                ", perOld=" + perOld +
                '}';
    }
}
