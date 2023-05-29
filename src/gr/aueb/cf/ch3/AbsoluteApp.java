package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ternary operator
 */

public class AbsoluteApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please enter a number");
        num = in.nextInt();

        // absolute is num if num is > 0 else absolute is -num if num is < 0 else absolute is 0
        abs = (num > 0) ? num : (num < 0) ? -num : 0;

        System.out.println("Absolute of " + num + " is " + abs);
    }
}
