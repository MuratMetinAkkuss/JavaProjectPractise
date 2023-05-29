package May22;

import java.util.Scanner;

public class Rectangle implements ITransactions{
    Scanner scanner = new Scanner(System.in);
    static int shortside, longSide , resultOfCircumference , resultOfArea;
    @Override
    public void circumference() {
        System.out.print("Kisa kenar uzunlugunu giriniz : " );
        shortside = scanner.nextInt();
        System.out.print("Lutfen uzun kenarin uzunlugunu giriniz: ");
        longSide = scanner.nextInt();
        resultOfCircumference = 2 *(shortside + longSide);
        System.out.println("Dikdortgenin Cevresi : " + resultOfCircumference);

    }

    @Override
    public void area() {
        resultOfArea = shortside * longSide ;
        System.out.println("Dikdortgenin alani : " + resultOfArea);

    }
}
