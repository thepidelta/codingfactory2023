package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Counts the sum of positive integers that the user inputs
 */

public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int totalPositives = 0;

        System.out.println("Please input an integer");
        inputNum = in.nextInt();

        while (inputNum > 0){
            totalPositives++;
            System.out.println("Please input an integer");
            inputNum = in.nextInt();
        }
        System.out.printf("You entered %d positive integers" , totalPositives);
    }
}
