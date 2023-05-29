package gr.aueb.cf.ch2;

import java.util.Scanner;

/** Converts euros to US dollars
 * Gets an integer from the user (stdin)
 * that represents the amount in euros.
 * Then it converts this amount in US dollars
 * and displays the result
 */
public class EuroToUsdConverterApp {

    public static void main(String[] args) {

        // Declaration & Initialization
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        // Commands
        System.out.print("Please type the amount of euros: ");
        inputEuros = scanner.nextInt();
        totalUsCents = inputEuros * PARITY;
        usaDollars = totalUsCents / 100;
        usaCents = totalUsCents % 100;

        // Results output
        System.out.printf("%d Euros = %d dollars and %d cent(s)", inputEuros, usaDollars, usaCents);
    }
}
