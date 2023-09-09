
/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.24.2022
 * (1) Prompt the user which action they want to take:
 *      (a) Convert cubic feet to U.S. bushels
 *      (b) Convert miles to kilometers
 *      (c) Determine graduation with honors title
 *      (d) Exit program
 * (2) Programs at a minimum must have the following methods:
 *      (a) Convert cubic feet method gets cubic feet and returns U.S. bushels.
 *      (b) Convert to kilometers method that gets miles and returns kilometers
 *      (c) Determine graduation with honors title method that gets GPA and returns honors title value
 * (3) For each action, the user should be prompted for corresponding data and given the appropriate output
 * (4) User should be able to select one action and then get prompted again for selection until they select exit choice
 */
import java.util.Scanner;

public class AssignmentFive {
    public static double feetToBushels(int feet) {
        // calculates conversion: 1 cubic foot = 0.803564 U.S. bushel
        double output = feet * 0.803564;
        return output;
    }

    public static double milesToKm(int miles) {
        // calculates conversion: 1 mile = 1.60934 km
        double output = miles * 1.60934;
        return output;
    }

    public static String gpaToTitle(double gpa) {
        // calculates Honors title given gpa

        String output;

        if (gpa < 3.5) {
            // nothing
            output = "";
        } else if (gpa < 3.8) {
            // Cum Laude 3.5-3.7
            output = "Cum Laude";
        } else if (gpa < 4.0) {
            // Magna Cum Laude 3.8-3.9
            output = "Magna Cum Laude";
        } else {
            // Summa Cum Laude 4.0+
            output = "Summa Cum Laude";
        }

        return output;
    }

    public static void displayMenu() {
        // prints out selection menu
        System.out.println("Menu");
        System.out.println("1: Convert cubic feet to U.S. bushels");
        System.out.println("2: Convert miles to kilometers");
        System.out.println("3: Determine graduation title with honors");
        System.out.println("-1: Exit program");
        System.out.print("Enter your selection: ");
    }

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 141 7383. 11.24.2022.\n");

        // declare variables
        Scanner intScanner = new Scanner(System.in);
        Scanner doubleScanner = new Scanner(System.in);
        int selection;
        int intput;
        double dinput;
        double doutput;
        String stroutput;

        // prompt for selection input
        displayMenu();
        selection = intScanner.nextInt();

        while (selection != -1) {
            while (selection > 3 | selection < 1) {
                // bad input, ask again
                System.out.print("Error! Enter your selection: ");
                selection = intScanner.nextInt();
            }

            // good input, run selected calculation
            switch (selection) {
                case 1:
                    // prompt for input
                    System.out.print("Enter cubic feet: ");
                    intput = intScanner.nextInt();
                    // do calculation
                    doutput = feetToBushels(intput);
                    // show output
                    System.out.printf("\n%d cubic feet = %f US bushels\n\n", intput, doutput);
                    break;
                case 2:
                    // prompt for input
                    System.out.print("Enter miles: ");
                    intput = intScanner.nextInt();
                    // do calculation
                    doutput = milesToKm(intput);
                    // show output
                    System.out.printf("\n%d miles = %f km\n\n", intput, doutput);
                    break;
                case 3:
                    // prompt for input
                    System.out.print("Enter GPA: ");
                    dinput = doubleScanner.nextDouble();
                    // do calculation
                    stroutput = gpaToTitle(dinput);
                    // show output
                    System.out.printf("\nCongratulations, you have graduated %s!\n\n", stroutput);
                    break;
            }

            // get next selection
            displayMenu();
            selection = intScanner.nextInt();
        }
        System.out.print("\nThank you for using this program. Goodbye!");

        // close scanners
        intScanner.close();
        doubleScanner.close();
    }
}
