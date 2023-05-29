package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Displays a selection menu until the user selects exit
 */

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int selection = 0;

        System.out.println("Please select: ");
        do {
            System.out.println("1. New product registration");
            System.out.println("2. Delete existing product");
            System.out.println("3. Exit");
            selection = in.nextInt();
        } while (selection != 3);


    }
}
