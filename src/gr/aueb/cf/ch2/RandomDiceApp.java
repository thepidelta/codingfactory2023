package gr.aueb.cf.ch2;

/**
 * Throws 2 dice and gets the result
 */
public class RandomDiceApp {

    public static void main(String[] args) {
        int die1 = 0;
        int die2 = 0;

        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;

        System.out.printf("Die 1: %d, die 2: %d", die1, die2);
    }
}
