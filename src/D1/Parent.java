package D1;

public class Parent  {
    String isim = "istanbul";
    String soyIsim;
    String telefon;
    int yas;
    double maas;
    public Parent(){

    }
    public Parent(String isim, String soyIsim, String telefon, int yas, double maas) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.telefon = telefon;
        this.yas = yas;
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", telefon='" + telefon + '\'' +
                ", yas=" + yas +
                ", maas=" + maas +
                '}';
    }
}

