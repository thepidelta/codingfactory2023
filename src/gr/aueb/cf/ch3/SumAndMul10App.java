package gr.aueb.cf.ch3;

/**
 * Calculates sum and mul of the first 10 integers
 */

public class SumAndMul10App {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <=10) {
            sum += i;
            mul = mul * i;
            i++;
        }
        System.out.println("Sum is " + sum);
        System.out.println("Mul is " + mul);

    }
}
