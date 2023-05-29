package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator;
        int denominator;
        int result;

        try{
            System.out.println("Please type two integers for division");
            numerator = in.nextInt();
            denominator = in.nextInt();

            result = numerator / denominator;

            System.out.printf("%d / %d = %d", numerator, denominator, result);
        } catch (ArithmeticException e) {
//
            System.out.println("Λάθος παρονομαστής");
        }
    }
}
