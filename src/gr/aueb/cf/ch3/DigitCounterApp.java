package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the amount of digits of a given integer, their sum
 * and the sum of the first and last digits
 */

public class DigitCounterApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sum = 0;
        int sumLeftRight = 0;
        int currentDigit = 0;
        int rightMostDigit = 0;
        int leftMostDigit = 0;

        System.out.println("Please input an integer: ");
        inputNum = in.nextInt();

        num = inputNum;

        do {
            count++;
            currentDigit = num % 10;
            sum += currentDigit;
            if (count == 1){
                rightMostDigit = currentDigit;
            }
            num = num / 10;
        } while (num != 0);

        leftMostDigit = currentDigit;
        sumLeftRight = leftMostDigit + rightMostDigit;

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Sum of left & right most digits: " + sumLeftRight);
    }
}
