package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * User inputs a 2-digit integer and
 * the app calculates the sum of the
 *  two digits
 */
public class IntTwoDigitsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int digitSum = 0;

        System.out.println("Please input a 2 digit integer");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        digitSum = leftDigit + rightDigit;

        System.out.printf("Left and right digit sum = %d", digitSum);
    }
}
