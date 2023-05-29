package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Decides if an int is even or odd
 */
public class EvenOddApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean numIsEven = false;

        System.out.println("Please provide an integer");
        num = in.nextInt();

        numIsEven = isEven(num);

        System.out.println("Number " + num + " is even: " + numIsEven);

    }

    /**
     * Evaluates an integer if it is even or not.
     * @param num   the number to evaluate
     * @return  true if num is even, false otherwise
     */
    public static boolean isEven(int num){
        return num % 2 == 0;
//        if (num % 2 == 0){
//            return true;
//        } else {
//            return false;
//        }
    }
}
