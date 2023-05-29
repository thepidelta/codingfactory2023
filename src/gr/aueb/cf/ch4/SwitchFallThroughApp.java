package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Asks user to input a grade and it
 * provides feedback based on the degree
 * in the form of Excellent, Very Good, Good, Fail
 */

public class SwitchFallThroughApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 0;

        System.out.println("Please type your grade");
        grade = in.nextInt();

        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Whoops, failed!");
                break;
            case 5:
            case 6:
                System.out.println("Good!");
                break;
            case 7:
            case 8:
                System.out.println("Very Good!");
                break;
            case 9:
            case 10:
                System.out.println("Excellent!");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
