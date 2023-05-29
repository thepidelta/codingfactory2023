package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts seconds to days, hours, minutes and seconds
 */
public class SecondsDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputSeconds = 0;
        final int SECS_IN_DAY = 24 * 3600;
        final int SECS_IN_HOUR = 3600;
        final int SECS_IN_MINUTE = 60;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Please enter seconds");
        inputSeconds = in.nextInt();
        days = inputSeconds / SECS_IN_DAY;
        hours = (inputSeconds % SECS_IN_DAY) / SECS_IN_HOUR;
        minutes = ((inputSeconds % SECS_IN_DAY) % SECS_IN_HOUR) / SECS_IN_MINUTE;
        seconds = (((inputSeconds % SECS_IN_DAY) % SECS_IN_HOUR) % SECS_IN_MINUTE);
        System.out.printf("%,d seconds equal to %d days, %d hours, %d minutes, %d seconds",inputSeconds, days, hours, minutes, seconds);

    }
}
