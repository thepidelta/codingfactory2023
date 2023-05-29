package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού και ο χρήστης δίνει μια επιλογή και λαμβάνει ένα αντίστοιχο feedback.
 */

public class ExcerciseMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Ενημέρωση");
            System.out.println("3. Διαγραφή");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            if (choice < 1 || choice > 5){
                System.out.println("Μη έγκυρη επιλογή");
                continue;
            }

            if (choice == 5) {
                System.out.println("Επιλέξατε έξοδο");
            }

            if (choice == 1){
                System.out.println("Επιλέξατε εισαγωγή");
            }else if (choice == 2){
                System.out.println("Επιλέξατε ενημέρωση");
            }else if (choice == 3){
                System.out.println("Επιλέξατε διαγραφή");
            }else {
                System.out.println("Επιλέξατε αναζήτηση");
            }
        } while (choice != 5);
    }
}
