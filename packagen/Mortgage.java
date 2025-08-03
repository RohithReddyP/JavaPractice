package packagen;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        final byte MonthsInYear = 12;
        final byte Percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/Percent/MonthsInYear;
        System.out.print("Period (years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years*MonthsInYear;
        double mortgage = principal*(monthlyInterest*Math.pow(1+monthlyInterest,numberOfPayments))/(Math.pow(1+monthlyInterest,numberOfPayments)-1);
        System.out.println(mortgage);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+mortgageFormatted);
    }
}
