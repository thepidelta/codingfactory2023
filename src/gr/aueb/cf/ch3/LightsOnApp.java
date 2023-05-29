package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * This app decides if the car's headlights must
 * turn on, based on 3 conditions:
 * It must be raining AND (it is dark OR speed is over 100 km/h)
 * The conditions are inputted by the user
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputSpeed = 0;
        boolean inputIsRaining = false;
        boolean inputIsDark = false;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Is it raining? true/false");
        inputIsRaining = in.nextBoolean();
        System.out.println("Is it dark? true/false");
        inputIsDark = in.nextBoolean();

        System.out.println("What's the car's current speed?");
        inputSpeed = in.nextInt();

        lightsOn = (inputIsRaining == true) && ((inputIsDark == true) || (inputSpeed > MAX_SPEED));

        System.out.println("Lights on is " + lightsOn);


    }
}
