package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο frog βρίσκεται στη θέση X και θέλει να φτάσει
 * στη θέση Y ή σε θέση μεγαλύτερη του Υ.
 * Ο frog jumps a fixed distance D. This app finds the minimum number of jumps
 * that the from needs to take
 */

public class FrogApp {
    public static void main(String[] args) {
        int x;
        int y;
        int d;
        int jumps;
        int distance = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Where does the from start from?");
        x = in.nextInt();
        System.out.println("Where does the form need to reach?");
        y = in.nextInt();
        System.out.println("How far does the frog jump");
        d = in.nextInt();

        distance = y - x;
        System.out.println("Distance is " + distance);
        if ((distance % d) == 0){
            jumps = distance / d;
        } else jumps = (distance / d) + 1;

        System.out.println("Minimum number of jumps: " + jumps);

    }
}
