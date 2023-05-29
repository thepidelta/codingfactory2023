package gr.aueb.cf.ch2;

import java.util.Scanner;

/** Asks the user to input 3 integers and
 * then reduces each integer by 1. Then
 * it displays those integers in the same
 * sequence and leaves one space betwen them
 */
public class ThreeNumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please type three integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        num1--;
        num2--;
        num3--;
        System.out.printf("%d %d %d",num1, num2, num3);



    }
}
