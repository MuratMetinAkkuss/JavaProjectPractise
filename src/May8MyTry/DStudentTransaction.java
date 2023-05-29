package May8MyTry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class DStudentTransaction {

    ArrayList<BStudent> students = new ArrayList<>();
    GMainMenu obj;
    Scanner scanner = new Scanner(System.in);


     void dStudentTransaction() {
         System.out.println("============= İŞLEMLER =============\n" +
                 "\t\t 1-EKLEME\n" +
                 "\t\t 2-ARAMA\n" +
                 "\t\t 3-LİSTELEME\n" +
                 "\t\t 4-SİLME\n" +
                 "\t\t Q-ÇIKIŞ\n" +
                 "\n"
         );
         System.out.print("SEÇİMİNİZ: ");
         System.out.println("");
         char choose = scanner.next().toUpperCase().charAt(0);
         switch (choose) {
             case '1': {
                 adding();
             }
             case '2': {
                 searching();
             }
             case '3': {
                 makeOrder();
             }
             case '4': {
                 deleteStudent();
             }
             case 'Q': {
             }
         }
     }
    private void adding() {
         //seçilen Kişi türü ile ilgili ekleme
        scanner.nextLine();
        System.out.println("Lutfen isminizi giriniz");
        String name = scanner.nextLine();
        System.out.println("Lutfen Soy-isminizi giriniz");
        String lastName = scanner.nextLine();
        System.out.println("Lutfen Tc no giriniz");
        String idNo = scanner.nextLine();
        System.out.println("Lutfen yas giriniz");
        int perAge = scanner.nextInt();
        System.out.println("Lutfen sinif numarasi giriniz");
        int classNumber = scanner.nextInt();
        System.out.println("Lutfen sinif giriniz");
        scanner.nextLine();
        String whichClass = scanner.nextLine();
        BStudent student1 = new BStudent(name,lastName,idNo,perAge,classNumber, whichClass);
        students.add(student1);
        makeOrder();
        System.out.println("");
        dStudentTransaction();





    }
    private void searching() {
         //kimlik no ile arama
        System.out.println("Aranacak TC no giriniz");
        scanner.nextLine();
        String idSearch = scanner.nextLine();
        int flag = 0;

        for (BStudent each: students
             ) {
            if (each.getIdNo().equals(idSearch)){
                System.out.println("Istedginiz ogrenci bilgileri: " + students);
                flag++;
                System.out.println("devam etmek icin 1 ogrenci islemlerine donmek icin 2 ye basiniz");
                int choose = scanner.nextInt();
                if (choose == 1){searching();}
                if (choose == 2){dStudentTransaction();}
                break;
            }
        }if (flag == 0){
            System.out.println("Aradiginiz ogrenci listede bulunmamaktadir.");
            System.out.println("devam etmek icin 1 ogrenci islemlerine donmek icin 2 ye basiniz");
            int choose = scanner.nextInt();
            if (choose == 1){searching();}
            if (choose == 2){dStudentTransaction();}
        }

    }
    private void makeOrder() {
        for (BStudent each: students
             ) {
            System.out.println(each);
        }
    }
    private void deleteStudent() {
        System.out.println("Silinecek TC no giriniz");
        scanner.nextLine();
        String idSearch = scanner.nextLine();
        int flag = 0;

        for (BStudent each: students
        ) {
            if (each.getIdNo().equals(idSearch)){
                System.out.println("Silmek istediginiz ogrenci bilgileri: " + students);
                students.remove(each);
                flag++;
                System.out.println("devam etmek icin 1 ogrenci islemlerine donmek icin 2 ye basiniz");
                int choose = scanner.nextInt();
                if (choose == 1){searching();}
                if (choose == 2){dStudentTransaction();}
                break;
            }
        }if (flag == 0){
            System.out.println("Silmek istediginiz ogrenci listede bulunmamaktadir.");
            System.out.println("devam etmek icin 1 ogrenci islemlerine donmek icin 2 ye basiniz");
            int choose = scanner.nextInt();
            if (choose == 1){searching();}
            if (choose == 2){dStudentTransaction();}
        }
    }
    private void quit(){
        System.out.println("ana menuye yonlendiriliyorsunuz!!");
        obj.mainMenu();
    }
}
