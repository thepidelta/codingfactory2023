package gr.aueb.cf.ch2;

/**
 * Overflow
 */
public class AddApp {
    public static void main(String[] args) {
        int num1 = 2_147_483_647;//Java allows to separate after thousand with underscore
        long num3 = 2_147_483_647;
        int num2 = 2;
        long num4 = 2;
        int result1 = 0;
        long result2 = 0;

        result1 = num1 + num2;
        result2 = num3 + num4;

        System.out.printf("Sum1: %d",result1);
        System.out.printf("Sum2: %d",result2);
    }
}
