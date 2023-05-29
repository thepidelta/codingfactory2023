package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Reads Hours, Minutes, Seconds and
 * converts to seconds
 */
public class SecondsApp {

    public static void main(String[] args) {
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        final int SECS_IN_HOUR = 3600;
        final int SECS_IN_MINUTE = 60;
        int totalSeconds = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter hours, minutes and seconds");
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();
        totalSeconds = (inputHours * SECS_IN_HOUR) + (inputMinutes * SECS_IN_MINUTE) + inputSeconds;
        System.out.printf(Locale.forLanguageTag("el"),"%d hours, %d minutes, %d seconds = %,d seconds",inputHours, inputMinutes, inputSeconds, totalSeconds);
    }
}
