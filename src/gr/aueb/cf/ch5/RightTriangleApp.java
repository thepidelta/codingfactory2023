package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές από το χρήστη, τις a,b,c
 * όπου a είναι η υποτείνουσα και b,c οι δύο πλευρές.
 * ελέγχει αν το τρίγωνο είναι ορθογώνιο δηλ
 * a^2 = b^2 + c^2
 */
public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;

        System.out.println("Please provide a, b, c");

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - (b*b + c*c)) <= EPSILON){
            System.out.println("It is right triangle");
        } else {
            System.out.println("It is not right triangle");
        }
    }
}
