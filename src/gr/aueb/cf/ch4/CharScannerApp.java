package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Reads a char using the scanner command
 */

public class CharScannerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char inputChar;

        System.out.println("Please input a ASCII char");
        inputChar = in.next().charAt(0);

        System.out.println("Char: " + inputChar);
    }
}
