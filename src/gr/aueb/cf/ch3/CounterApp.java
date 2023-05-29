package gr.aueb.cf.ch3;

/**
 * Performs a specified number of loops based on the initialization of
 * i and the step of i
 */

public class CounterApp {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            System.out.print("*");
            i++;
        }
    }
}
