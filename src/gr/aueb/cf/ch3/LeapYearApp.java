package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν ένα έτος είναι δίσεκτο (leap year),
 * όπου δίσεκτο σημαίνει ότι το έτος διαιρείται ακριβώς με το 4,
 *αλλά δε διαιρείται ακριβώς με το 100. Αν διαιρείται ακριβώς με το 100,
 * και αν διαιρείται εκριβώς με το 400 τότε είναι δίσεκτο.
 */

public class LeapYearApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        boolean isLeap = false;

        System.out.println("Please provide a year (int)");
        year = in.nextInt();

        isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        if (year % 4 == 0){
            if (year % 100 != 0){
                isLeap = true;
            } else if (year % 400 == 0) {
                isLeap = true;
            }
        }

    }
}
