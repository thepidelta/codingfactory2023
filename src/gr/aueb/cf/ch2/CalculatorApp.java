package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * User inputs two integers and the app
 * calculates + ,- ,* ,/ ,%
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum1 = 0;
        int inputNum2 = 0;

        System.out.println("PLease enter two integers");
        inputNum1 = in.nextInt();
        inputNum2 = in.nextInt();

        System.out.println("Sum: " + (inputNum1 + inputNum2));
        System.out.println("Sub: " + (inputNum1 - inputNum2));
        System.out.println("Mul: " + (inputNum1 * inputNum2));
        System.out.println("Div: " + (inputNum1 / inputNum2));
        System.out.println("Mod: " + (inputNum1 % inputNum2));
    }
}
