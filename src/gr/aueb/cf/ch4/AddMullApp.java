package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Adds and multiplies n integers. n is provided by the user
 */
public class AddMullApp {
    public static void main(String[] args) {
        int n = 0;
        int sum = 0;
        int result = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Please input an integer");
        n = in.nextInt();

        for (int i = 1; i <= n; i++){
            sum = sum + i;
            result = result * i;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + result);
        System.out.printf("Mul: %,d", result);
    }
}
