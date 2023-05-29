package gr.aueb.cf.ch3;

import java.util.Scanner;

public class ParagontikoApp {
    public static void main(String[] args) {
        int inputNum = 0;
        Scanner in = new Scanner(System.in);
        int i = 1;
        long result = 1L;

        System.out.println("Please input the number to factor");
        inputNum = in.nextInt();

        while (i <= inputNum) {
            result = (result * i);
            i++;
        }
        System.out.printf("Factorial of %d is %,d", inputNum, result);



    }
}
