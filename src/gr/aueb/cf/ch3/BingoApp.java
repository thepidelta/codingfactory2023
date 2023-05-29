package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * When the user guesses right the secret key,
 * it displays a Bingo!
 */

public class BingoApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 11;

        while (true){
            System.out.println("Guess the secret number! (1 to 50)");
            num = in.nextInt();

            if (num == SECRET){
                System.out.println("Bingo!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
