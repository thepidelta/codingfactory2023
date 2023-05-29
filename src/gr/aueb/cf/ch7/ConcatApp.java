package gr.aueb.cf.ch7;

/**
 * Concatenates two or more strings
 */
public class ConcatApp {
    public static void main(String[] args) {
        String title = "Her Majesty";
        String firstname = "Anaksunamun";
        String lastname = "Imenhotept";
        String fullName;
        String titledFullName;

        fullName = firstname + lastname;
        System.out.println(fullName);

        titledFullName = title.concat(firstname).concat(lastname);
        System.out.println(titledFullName);
    }
}
