package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Asks the user to input the number of stars
 * that the app will display
 */

public class StarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int inputN = 0;

        System.out.println("Please input how many stars you want to see :-)");
        inputN = in.nextInt();

        while (i < inputN){
            System.out.print("*");
            i++;
            if (i % 50 == 0){
                System.out.println();
            }
        }

    }
}
