package May08;

import May8MyTry.BStudent;
import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.Scanner;

public class StundentsTransaction {
    Scanner scanner = new Scanner(System.in);

    static ArrayList<Student> studentList = new ArrayList<>();

    void studentMenu() throws InterruptedException {
        System.out.println("============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t Q-ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:");
        char yourChoose = scanner.next().toUpperCase().charAt(0);
        switch (yourChoose) {
            case '1': {
                adding();
            }
            case '2': {
            }
            searching();
            case '3': {
                makeList();

            }
            case '4': {
                deleteStudent();
            }
            case 'Q': {
                MainMenu mainMenu = new MainMenu();
                mainMenu.menu();
            }
        }
    }

    private void deleteStudent() throws InterruptedException {
        //delete and search with id no
        System.out.println("Silinecek ogrencin tc nosunu giriniz: ");
        String idNo = scanner.next();
        boolean flag = false;
        for (int i = 0; i < studentList.size(); i++) {

            if (idNo.equals(studentList.get(i).getIdNumber())) {
                System.out.println("Silinecek ogrencinin bilgileri : " + studentList.get(i).getIdNumber());
                studentList.remove(i);
                flag = true;
                break;
            }
        }
        if (!flag) {// here is if this block works then the flag has to be false
            System.out.println(idNo + " ya ait veri bulunmamaktadir...");
            studentMenu();
        }
        Thread.sleep(3000);
        studentMenu();
    }

    private void searching() throws InterruptedException {
        //kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
        System.out.println("aramak istediginiz kisinin tc nosunu giriniz:");
        String searchingId = scanner.nextLine();
        int flag = 0;
        for (Student each : studentList
        ) {
            if (each.getIdNumber().equals(searchingId)) {
                System.out.println("aradiginiz ogrenci : " + each);
                flag++;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Aradiginiz ogrenci bulunamamistir");
            studentMenu();
            makeList();
        }
        studentMenu();
    }

    private void makeList() throws InterruptedException {
        for (Student each : studentList
        ) {
            System.out.println(each);
        }
        Thread.sleep(3000);
        studentMenu();

    }

    private void adding() throws InterruptedException {
        scanner.nextLine();
        // Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
        System.out.println("Ogrenicin adini giriniz: ");
        String name = scanner.nextLine();
        System.out.println("Ogrenicin soyadini giriniz: ");
        String lastName = scanner.nextLine();
        System.out.println("Ogrenicin TCNO giriniz: ");
        String idNumber = scanner.nextLine();
        System.out.println("Ogrenicin yasini giriniz: ");
        int perOld = scanner.nextInt();
        System.out.println("Ogrenicin numarasini giriniz: ");
        int number = scanner.nextInt();
        System.out.println("Ogrenicin sinifini giriniz: ");
        scanner.nextLine();
        String studentClass = scanner.nextLine();
        Student student1 = new Student(name,lastName,idNumber,perOld,number,studentClass);
        studentList.add(student1);
        //System.out.println(studentList);
        makeList();
        studentMenu();
    }
}
