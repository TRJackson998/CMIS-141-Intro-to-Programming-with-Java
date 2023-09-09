
/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 12.4.2022
 */
import java.util.Scanner;

public class AssignmentSix {

    public static int getMinScore(int[] scores) {
        // determines the index of the minimum score
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < scores[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int getMaxScore(int[] scores) {
        // determines the index of the maximum score
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > scores[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 141 7383. 12.4.2022.\n");

        // declare variables
        Scanner intScanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);
        int numTeams;
        int[] scores;
        String[] names;
        int minScore;
        int maxScore;

        // get first input
        System.out.print("How many teams? ");
        numTeams = intScanner.nextInt();

        // init arrays
        scores = new int[numTeams];
        names = new String[numTeams];

        // get input for arrays
        for (int i = 0; i < numTeams; i++) {
            System.out.println("Team " + (i + 1));
            System.out.print("\tEnter team's name: ");
            names[i] = strScanner.nextLine();
            System.out.print("\tEnter team's score (400-1000): ");
            scores[i] = intScanner.nextInt();
            while ((scores[i] < 400) | (scores[i] > 1000)) {
                System.out.print("\tError! Enter team's score (400-1000): ");
                scores[i] = intScanner.nextInt();
            }
        }

        // process min and max
        minScore = getMinScore(scores);
        maxScore = getMaxScore(scores);

        // output
        System.out.println();
        for (int i = 0; i < numTeams; i++) {
            System.out.printf("%-20s ", names[i]);
            System.out.println(scores[i]);
        }
        System.out.println("The " + names[minScore] + " have the lowest score at " + scores[minScore]);
        System.out.println("The " + names[maxScore] + " have the highest score at " + scores[maxScore]);

        // close Scanner
        intScanner.close();
        strScanner.close();
    }
}
