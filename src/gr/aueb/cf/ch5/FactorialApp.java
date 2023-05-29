package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του N με μέθοδο facto()
 */

public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int result;

        System.out.println("Please input the an integer");
        n = in.nextInt();
        result = facto(n);

        System.out.printf("factorial of %d is %,d",n, result);
    }

    /**
     * επιστρέφει το παραγοντικό του n
     *
     * @param n the number of n!
     * @return  1 * 2 * 3 * ... * n
     */
    public static int facto(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
