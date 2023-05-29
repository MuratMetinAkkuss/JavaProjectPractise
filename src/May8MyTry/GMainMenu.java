package May8MyTry;

import java.util.Scanner;

public class GMainMenu {

    DStudentTransaction dStudentTransaction;
    ETeacherTransaction eTeacherTransaction;
    Scanner scanner = new Scanner(System.in);
    void mainMenu(){
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ");
        System.out.print("Secimiz: ");
        char choose = scanner.next().toUpperCase().charAt(0);
        System.out.println("");

        switch (choose){
            case '1': {
                dStudentTransaction = new DStudentTransaction();
                dStudentTransaction.dStudentTransaction();
            }
            case '2':{

            }
            case 'Q':{

            }
        }
    }
}
