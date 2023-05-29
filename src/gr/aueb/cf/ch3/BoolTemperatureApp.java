package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app decides if it is snowing based on given
 * temperature (if temp<0 then it is snowing)
 */
public class BoolTemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputTemp = 0;
        boolean isSnowing = false;

        System.out.println("Please enter the current temperature");
        inputTemp = in.nextInt();

        isSnowing = (inputTemp <= 0);

        System.out.println("Is snowing = " + isSnowing);

    }
}
