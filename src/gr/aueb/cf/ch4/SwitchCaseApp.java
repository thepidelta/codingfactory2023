package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Switch instead of if-then-else-if
 * Reads the user's choice based on a menu and
 * returns some feedback
 */

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following:");
            System.out.println("1. Single player game");
            System.out.println("2. Two players game");
            System.out.println("3. Team game");
            System.out.println("4. Exit");
            System.out.println("Please type your selection");

            choice = in.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Start single player game");
                    break;
                case 2:
                    System.out.println("Start two players game");
                    break;
                case 3:
                    System.out.println("Start team game");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid selection");
                    break;
            }
        } while (choice != 4);

        System.out.println("Goodbye!");


    }
}
