package gr.aueb.cf.ch5;

/**
 * attempts to swaps mutually 2 values that the user inputs
 * it does not work because the swap takes place in the swap method
 * and that means that only the local a and b swap, not the ones in
 * the main method
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);

        System.out.println("a = " + a + "\nb = " + b);

    }

    /**
     * Swaps a, b s = a -> b, b -> a
     * @param a
     * @param b
     */
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}
