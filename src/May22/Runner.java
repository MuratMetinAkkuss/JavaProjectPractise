package May22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        menu();


    }

    private static void menu() throws InterruptedException {
        System.out.println("Hesaplamak istediginiz geometrik sekli seciniz: \n" +
                "1. Dikdortgen \n" +
                "2. Kare \n" +
                "3. Daire \n" +
                "Cikis icin Q harfine basiniz...");

        try {
            int chossen = scanner.nextInt();
            switch (chossen) {
                case 1: {
                    Rectangle rectangle = new Rectangle();
                    rectangle.circumference();
                    rectangle.area();
                    Thread.sleep(2000);
                    menu();
                }
                case 2: {
                    Square square = new Square();
                    square.circumference();
                    square.area();
                    Thread.sleep(2000);
                    menu();
                }
                case 3: {
                    Circle circle = new Circle();
                    circle.circumference();
                    circle.area();
                    Thread.sleep(2000);
                    menu();
                }
                default: {
                    System.out.println("Hatali giris yaptiniz");
                    menu();
                }
            }


        } catch (InputMismatchException e) {
            char choosen = scanner.next().toUpperCase().charAt(0);
            if (choosen == 'Q') {
                System.out.println("Cikis islemi yapiliyor");
                System.exit(0);
            } else {
                System.out.println("Hatali giris yaptiniz, tekrar deneyiniz.");
                menu();
            }

        }
    }
}
