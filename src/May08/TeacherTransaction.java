package May08;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherTransaction {

    Scanner scanner = new Scanner(System.in);

    static ArrayList<Teacher> teachers = new ArrayList<>();

    void Teachermenu() throws InterruptedException {
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
        // write teacher id no that if you want to delete it
        System.out.println("Lutfen ogretmenin id nosunu giriniz : ");
        String deleteTeacher = scanner.next();
        boolean flag = true;

        for (int i = 0; i < teachers.size(); i++) {

            if (deleteTeacher.equals(teachers.get(i).getIdNumber())) {

                System.out.println(teachers.get(i).toString() + " ogretmeni silinecektir");
                teachers.remove(i);
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println("Istediginiz ogretmen bulunamamistir.");
            Teachermenu();
        }
        Thread.sleep(3000);
        Teachermenu();

    }

    private void searching() throws InterruptedException {
        // write teacher id no that if you want to delete it
        System.out.println("Lutfen ogretmenin id nosunu giriniz : ");
        String searchTeacher = scanner.next();
        boolean flag = false;

        for (int i = 0; i < teachers.size(); i++) {

            if (searchTeacher.equals(teachers.get(i).getIdNumber())) {

                System.out.println(teachers.get(i)
                + "\n istediginiz ogretmene ait bilgiler.");
                break;

            }
        }
        if (!flag) {
            System.out.println("Istediginiz ogretmen bulunamamistir.");
            Teachermenu();
        }
        Thread.sleep(3000);
        Teachermenu();



    }

    private void makeList() throws InterruptedException {
        for (Teacher eachTeacher : teachers
        ) {
            System.out.println(eachTeacher);
        }
        Thread.sleep(2000);
        Teachermenu();
    }

    private void adding() throws InterruptedException {
        System.out.println("Ogretmenin adini giriniz : ");
        String teacherName = scanner.next();
        System.out.println("Ogretmenin soy adini giriniz : ");
        String lastName = scanner.next();
        System.out.println("Ogretmenin Id no giriniz : ");
        String idNo = scanner.next();
        System.out.println("Ogretmenin yasini giriniz : ");
        int teacherAge = scanner.nextInt();
        System.out.println("Ogretmenin departmanini giriniz :");
        String teacherDepartment = scanner.next();
        System.out.println("Ogretmenin calisma numarasini giriniz :");
        int teacherWorkNumber = scanner.nextInt();
        Teacher teacherAdding = new Teacher(teacherName, lastName, idNo, teacherAge, teacherDepartment, teacherWorkNumber);
        teachers.add(teacherAdding);
        makeList();


    }
}

