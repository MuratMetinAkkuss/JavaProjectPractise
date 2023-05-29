package May22;

import java.util.Scanner;

public class Circle implements ITransactions{
    static double radius , totalCircumference , totalArea;
    static Scanner scanner = new Scanner(System.in);
    @Override
    public void circumference() {
        System.out.println("Dairenin capini giriniz: ");
        radius = scanner.nextDouble();
        totalCircumference = 2*radius*Math.PI;
        System.out.println("Dairenin cevresi : " + totalCircumference);


    }

    @Override
    public void area() {
        totalArea = Math.PI*Math.pow(radius,2);
        System.out.println("Dairenin alani : " + totalArea);

    }
}
