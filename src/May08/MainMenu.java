package May08;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    StundentsTransaction stundentsTransaction;
    TeacherTransaction teacherTransaction;
    void menu() throws InterruptedException {
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ" +
                "\t SECIMINIZ: ");
        char secim = scanner.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':{
                stundentsTransaction = new StundentsTransaction();
                stundentsTransaction.studentMenu();
            }
            case '2':{
                teacherTransaction = new TeacherTransaction();
                teacherTransaction.Teachermenu();
            }
            case 'Q':{
                System.out.println("sistem kapatilmistir. ");
                System.exit(0);
            }
        }
    }
}
