package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το a^b αναδρομικά
 */
public class PowerRecursiveApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a;
        float b;
        System.out.println("Please provide a and n");
    }

    public static float pow(float a, float b){
        if (b < 0) {
            return 1 / pow(a, -b);
        }
        if (b == 0){
            return 1;
        }
        return a * pow(a, b - 1);

    }
}
