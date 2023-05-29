package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * A pilot flies a plane with 2 fuel tanks.
 * If one of them has less than 1/4 capacity
 * then we get an orange light.
 * If both tanks have less than 1/4 capacity then
 * we get a red light
 */

public class OrangeRedSignalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean inputTank1LTQuarter = false;
        boolean inputTank2LTQuarter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Is tank 1 capacity less than 1/4? true/false");
        inputTank1LTQuarter = in.nextBoolean();
        System.out.println("Is tank 2 capacity less than 1/4? true/false");
        inputTank2LTQuarter = in.nextBoolean();

        orangeOn = (inputTank1LTQuarter == true) || (inputTank2LTQuarter == true);
        redOn = (inputTank1LTQuarter == true) && (inputTank2LTQuarter == true);

        System.out.println("Orange light is on = " + orangeOn);
        System.out.println("Red light is on = " + redOn);

    }
}
