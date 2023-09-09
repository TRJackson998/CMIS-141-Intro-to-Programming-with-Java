/*
 * Prompt user for a positive integer (num), 
 * keep prompting if not greater than 0, 
 * and then use for-loop to print “Hello” to the console num times.
 */
import java.util.Scanner;
public class PracticeOne {

	public static void main(String[] args) {
		Scanner intScan = new Scanner(System.in);
		int input;
		
		do {
			System.out.print("Enter a positive integer: ");
			input = intScan.nextInt();
			if (input < 0) {
				System.out.print("Error! Negative number detected! ");
			}
		} while (input < 0);
		
		for (int i = 0; i < input; i++) {
			System.out.println("Hello");
		}
		
		intScan.close();

	}

}
