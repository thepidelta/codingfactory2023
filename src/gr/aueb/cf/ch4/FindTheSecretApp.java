package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * User has 10 tries to find a secret key (int)
 * If they find it before the 10th time, for must stop
 */
public class FindTheSecretApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;

        System.out.println("You have 10 tries to guess the secret key! Good luck!");

        for (int i = 9; i >= 0; i--){
            System.out.println("Guess the secret key: ");
            num = in.nextInt();
            if (num == SECRET_KEY){
                found = true;
                break;
            } else {
                System.out.printf("Sorry but %d was not the secret key...\n", + num);
                System.out.printf("You have %d tries remaining.\n", i);
            }
        }

        if (!found){
            System.out.println("No more tries remaining, please try again!");
            System.exit(1);
        }

        System.out.println("Well done! Feel free to play again!");
    }
}
