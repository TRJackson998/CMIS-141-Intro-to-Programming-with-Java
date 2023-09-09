
/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 12.4.2022
 *
 * Prompt user for a sentence and using an array, 
 * count how many vowels it has (a, e, i, o, u). 
 * You can use String.charAt(index) method to check each letter in the string
 */
import java.util.Scanner;

public class PracticeOne {
    public static int countVowel(String inString, char vowel) {
        // counts the supplied vowel and returns how many are in the input String
        int count = 0;
        char[] inArray = inString.toLowerCase().toCharArray();
        for (char letter : inArray) {
            if (letter == vowel) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 141 7383. 12.4.2022.\n");

        // init vars
        Scanner strScanner = new Scanner(System.in);
        String inString;
        char[] vowel_list = { 'a', 'e', 'i', 'o', 'u' };
        int[] vowel_count = new int[5];

        // get input
        System.out.print("Enter a sentence: ");
        inString = strScanner.nextLine();

        // process output
        for (int i = 0; i < 5; i++) {
            vowel_count[i] = countVowel(inString, vowel_list[i]);
            System.out.println(vowel_list[i] + " = " + vowel_count[i]);
        }

        // close Scanner
        strScanner.close();
    }
}
