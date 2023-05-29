package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app decides whether if it snowing or not,
 * based not only on given temperature but whether
 * it is raining as well.
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputTemp = 0;
        boolean inputIsRaining = false;
        boolean isSnowing = false;

        System.out.println("Please enter the current temperature");
        inputTemp = in.nextInt();
        System.out.println("Is it raining? true/false");
        inputIsRaining = in.nextBoolean();

        isSnowing = (inputTemp <= 0) && (inputIsRaining == true);
        System.out.println("Is snowing = " + isSnowing);
    }
}
