package gr.aueb.cf.ch7;

/**
 * transforms Strings
 */
public class LowerUpperTrimApp {
    public static void main(String[] args) {
        String s = "  Athens University   ";
        String lowercase;
        String uppercase;
        String trimmed;
        String s2 = "";

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trimmed = s.trim();

        System.out.println(s);
        System.out.println(lowercase);
        System.out.println(uppercase);
        System.out.println(trimmed);
        System.out.println();
        System.out.println("*".repeat(10));

        if (s2.isEmpty()){
            System.out.println(s2.length());
        }

    }
}
