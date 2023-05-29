package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates 2nd and 3rd of an int that the user inputs
 */
public class MathPowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please enter an integer: ");
        inputNum = in.nextInt();

        System.out.printf("integer: %d, squared: %d, cubed: %d",inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum, 3));

    }
}
