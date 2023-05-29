package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * calculates a^n using power() method
 */

public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int n;
        int result;

        System.out.println("Please provide a, n");
        a = in.nextInt();
        n = in.nextInt();

        result = power(a, n);
        System.out.printf("%d^%d is %,d",a, n, result);
    }

    public static int power(int a, int n){
        int result = 1;
        for (int i = 1; i <=n; i++){
            result *= a;
        }
        return result;
    }
}
