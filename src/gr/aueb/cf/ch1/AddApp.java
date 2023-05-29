package gr.aueb.cf.ch1;

/**
 * Προσθέτει 2 ακεραίους και εμφανίζει το αποτέλεσμα στο stdout
 */
public class AddApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 10;
        int num2 = 7;
        int result = 0;
        /*
        Μπορούμε και στην ίδια γραμμή int num1 = 10, num2 = 7, result = 0;
         */

        //Εντολές
        result = num1 + num2;
        //Εκτύπωση αποτελεσμάτων
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.printf("Το άθροισμα των %d , %d είναι %d", num1, num2, result);
    }
}
