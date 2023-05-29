package gr.aueb.cf.ch7;

/**
 * Splits a String
 */
public class StringSplitApp {
    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        String[] tokens = s.split(" +");//κενό+ το + υποδηλώνει 1 ή και περισσότερα από ό,τι προηγείται του +

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
