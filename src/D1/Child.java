package D1;

import May8MyTry.BStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Child extends Parent{


    Scanner scanner = new Scanner(System.in);
     ArrayList<Parent> liste = new ArrayList<>();

    public Child(String isim, String soyIsim, String telefon, int yas, double maas) {
        super(isim, soyIsim, telefon, yas, maas);
        //this.kullaniciData = kullaniciData;
    }

    public Child(){

    }

    public static void main(String[] args) {


    }

     void kullanicidanBilgi(){
        System.out.println("isim giriniz");
         String isim = scanner.nextLine();
        System.out.println("soyisim giriniz");
        String soyIsim = scanner.nextLine();
        System.out.println("telefon giriniz");
        String telefon = scanner.nextLine();
        System.out.println("yas giriniz");
        int yas = scanner.nextInt();
        System.out.println("maas giriniz");
        double maas = scanner.nextDouble();
        scanner.nextLine();
        Parent liste1 = new Parent(isim, soyIsim, telefon, yas, maas);
        liste.add(liste1);
        dondurme();

    }
    public void dondurme(){
        for (Parent each: liste
        ) {
            System.out.println(each);

        }
    }
}
