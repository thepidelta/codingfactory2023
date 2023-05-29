package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * User inputs 3 integers and the app
 * finds the bigest of the three
 */
public class MaxOfThreeIntsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum1;
        int inputNum2;
        int inputNum3;

        System.out.println("Please input three integers");
        inputNum1 = in.nextInt();
        inputNum2 = in.nextInt();
        inputNum3 = in.nextInt();

        System.out.printf("Max between %d, %d, %d is %d", inputNum1, inputNum2, inputNum3, Math.max(inputNum1, Math.max(inputNum2, inputNum3)));

    }
}
