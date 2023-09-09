
/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 12.4.2022
 * Write a Java program which declares and populates an array with some values (at least 5 values). 
 * hen it should call a method passing it the array. The method should modify the array values using a loop. 
 * Lastly, after the program calls the method, it should display the modified array contents to the console.
 */
import java.util.Scanner;

public class DiscussionSeven {
    public static int[] addExtraCredit(int[] scores, boolean[] add) {
        for (int i = 0; i < scores.length; i++) {
            if (add[i]) {
                scores[i] += 5;
            }
        }
        return scores;
    }

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 141 7383. 12.4.2022.\n");

        // declare variables
        Scanner boolScanner = new Scanner(System.in);
        boolean extraCredit;
        int[] scores = { 75, 68, 89, 91, 45, 78, 61 };
        String[] names = { "Chad", "Bill", "Kyle", "Abdul", "Spencer", "David", "Tony" };
        boolean[] extraCredits = new boolean[7];

        // get input
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Did %s get extra credit? (true/false): ", names[i]);
            extraCredit = boolScanner.nextBoolean();
            extraCredits[i] = extraCredit;
        }

        // process the array
        scores = addExtraCredit(scores, extraCredits);

        // show output
        for (int i = 0; i < names.length; i++) {
            if (scores[i] > 70) {
                System.out.println(names[i] + " passed!");
            } else {
                System.out.println(names[i] + " did not pass.");
            }
        }

        // close Scanner
        boolScanner.close();
    }
}
