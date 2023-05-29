package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * A simple calculator that can add, sub, mul, div, mod
 * Displays a menu for the user to select an action
 * gets the user's choice and then asks for two numbers.
 * Finally, it displays the result
 */
public class CalculatorApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int choice = 0;
        int result = 0;

        do {
            printMenu();
            choice = getNextInt("Please input your choice");

            if (isChoiceInvalid(choice)) {
                System.out.println("Choice is invalid");
                continue;
            }
            if (isChoiceQuit(choice)){
                break;
            }

            result = onChoiceGetResult(choice);
            System.out.println("Result is: " + result);


        } while (true);
    }

    public static void printMenu(){
        System.out.println("Please select the action to perform:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
        System.out.println("6. Quit");
    }

    public static int getNextInt(String message){
        System.out.println(message);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice){
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice){
        return choice == 6;
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int sub(int num1, int num2){
        return num1 - num2;
    }

    public static int mul(int num1, int num2){
        return num1 * num2;
    }

    public static int div(int num1, int num2){
        int value = 0;
        if (num2 == 0){
            value = Integer.MAX_VALUE;
        } else {
            value = num1 / num2;
        }
        return value;
    }

    public static int mod(int num1, int num2){
        int value = 0;
        if (num2 == 0){
            value = Integer.MAX_VALUE;
        } else {
            value = num1 % num2;
        }
        return value;
    }

    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("Please input the first number");
        int num2 = getNextInt("Please input the second number");
        int result = 0;


        switch (choice){
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
                break;
        }
        return result;
    }
}
