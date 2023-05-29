package May22;

import java.util.Scanner;

public class Square implements ITransactions {

    static Scanner scanner = new Scanner(System.in);
    int lenghtOfSide, totalCircumference, totalArea;

    @Override
    public void circumference() {

        System.out.println("Kare'nin kenar uzunlugunu giriniz : ");
        lenghtOfSide = scanner.nextInt();
        totalCircumference = 4 * lenghtOfSide;
        System.out.println("Kare'nin cevresi : " + totalCircumference);

    }

    @Override
    public void area() {
        totalArea = lenghtOfSide * lenghtOfSide;
        System.out.println("Kare'nin alani : " + totalArea);
    }
}
