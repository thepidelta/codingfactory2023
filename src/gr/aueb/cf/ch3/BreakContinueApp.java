package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Shows the usage of break and continue commands
 */
public class BreakContinueApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Please input a number");
            num = in.nextInt();
            if (num == 5){
                continue;
            }
            sum += num;
            if (num == 10){
                break;
            }
        }

        System.out.println("Sum is: " + sum);
    }
}
