package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * prints stars
 */
public class ProjectCh5 {

    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        boolean quit = false;
        String response = "";

        do {
            printMenu();
            response = getChoice();

            try {
                if (response.matches("[Qq]")) {
                    quit = true;
                } else {
                    printOnChoice(response);
                }
            } catch (IllegalArgumentException | IllegalAccessException e) {
                System.out.println("Invalid choice");
            }
        } while (!quit);

    }

    public static void printMenu() {
        System.out.println("Please select one of the following: ");
        System.out.println("1. Horizontal line of stars");
        System.out.println("2. Vertical line of stars");
        System.out.println("3. Box of stars");
        System.out.println("4. HV Ascending");
        System.out.println("5. HV Descending");
        System.out.println("Q or q to exit");
    }

    public static String getChoice() {
        return in.nextLine().trim();
    }

    public static void printOnChoice(String s) throws IllegalAccessException {
        int choice = -1;
        int n = 0;

        try {
            if (s == null) throw new IllegalAccessException();

            choice = Integer.parseInt(s);

            if ((choice >= 1 && choice <= 5)) {
                System.out.println("Please type the number of stars");
                n = Integer.parseInt(getChoice());
            }

            switch (choice) {
                case 1:
                    printStarsH(n);
                    break;
                case 2:
                    printStarsV(n);
                    break;
                case 3:
                    printStarsHV(n);
                    break;
                case 4:
                    printStarsHVASC(n);
                    break;
                case 5:
                    printStarsHVDesc(n);
                default:
                    throw new IllegalAccessException();
            }
        } catch (IllegalAccessException e) {
//          e.printStackTrace();
            throw e;
        }
    }

    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStarsHV(int n) {
        for (int i = 1; i <= n;i++) {
            printStarsH(n);
            System.out.println();
        }
    }

    public static void printStarsHVASC(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
            System.out.println();
        }
    }

    public static void printStarsHVDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
            System.out.println();
        }
    }

}
