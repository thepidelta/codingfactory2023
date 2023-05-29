package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Calculates a^n
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;
        int result = 1;

        System.out.println("Please input base, power");
        a = in.nextInt();
        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            result *= a; // result = result * a
        }

        System.out.printf("Result: %,d", result);
    }
}
