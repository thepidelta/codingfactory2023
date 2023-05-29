package gr.aueb.cf.ch2;

public class TypecastApp {
    public static void main(String[] args) {
        int num1 = 10; // Java considers all literals as int
        long num2 = 20; // Java will convert 20 from long to int
        long num3 = 20L; // In this case 20 is long
        long result1 = 0L;

        num1 = (int) num2; // Typecast, there is a danger that this will lead to data loss if num2 is larger than the capacity of int
        result1 = num1 + num2; // Java will perform autowidening to the largest type that exists in this expression
    }
}
