package gr.aueb.cf.ch8;

public class ArithmeticExceptApp {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;
        int result;

        // Αυτό δεν είναι σωστός τρόπος καθώς σε αυτή την περίπτωση κάνουμε mask το προγραμματιστικό μας λάθος
        // ενώ ουσιαστικά θέλουμε να τρέξει, να χτυπήσει το λάθος και να διορθώσουμε τον κώδικά μας
//        try {
//            result = num1 / num2;
//        } catch (ArithmeticException e) {
//            e.printStackTrace();
//        }

        if (num2 == 0){
            System.out.println("Please enter a proper number for the division");
            System.exit(1);
        }

        result = num1 / num2;

        System.out.println(result);
    }
}
