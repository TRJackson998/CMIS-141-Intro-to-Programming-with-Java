
/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 12.4.2022
 * 
 * Prompt user for a list of integers with 0 as the last value. 
 * Save values in an array. 
 * Assume there can be maximum 100 values. 
 * Print to the console only those numbers which are divisible by 5.
 */
import java.util.Scanner;

public class PracticeTwo {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 141 7383. 12.4.2022.\n");

        // init vars
        Scanner intScanner = new Scanner(System.in);
        int intput;
        int[] numbers = new int[100];

        // get input
        System.out.print("Enter: ");
        intput = intScanner.nextInt();
        for (int i = 0; intput != 0; i++) {
            numbers[i] = intput;
            intput = intScanner.nextInt();
        }

        // inefficient bc most of the array could be empty, should count inputs and then
        // only check over those. Len is still 100
        for (int number : numbers) {
            if (number % 5 == 0 & number != 0) {
                System.out.println(number);
            }
        }

        // close Scanner
        intScanner.close();
    }
}
