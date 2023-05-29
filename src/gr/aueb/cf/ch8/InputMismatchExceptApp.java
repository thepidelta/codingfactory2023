package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true){
            try{
                System.out.println("Please enter an integer");

                inputNum = in.nextInt();

                if (inputNum == MAGIC_NUM){
                    System.out.println("Well done! You found the magic number!");
                    break;
                }
            } catch (InputMismatchException e){
                //e.printStackTrace();
                in.nextLine();
                System.out.println("I said INTEGER...");
            }
        }

        System.out.println("Thanks for using the Magic App");
    }
}
