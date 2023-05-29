package gr.aueb.cf.ch2;

public class ExpressionsApp {

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;

        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;
        mod = num1 % num2;

        result1 = num1 + num2 * num2 - 5 / num1 % 4;
        result2 = (num1 + num2) * num2 - (5 / num1) % 4;
        result3 = num1++;
        result4 = ++num2;

        System.out.printf("sum: %d, sub: %d, mul: %d, div: %d, mod: %d\n",sum, sub, mul, div, mod);
        System.out.printf("Result1: %d, Result2: %d\n",result1, result2);
        System.out.printf("Result3: %d, Result4: %d",result3, result4);


    }

}
