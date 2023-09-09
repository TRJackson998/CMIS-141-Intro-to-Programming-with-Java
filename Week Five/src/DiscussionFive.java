/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.19.2022
 */
import java.util.Scanner;
public class DiscussionFive {

	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.19.2022.\n");
		
		//init vars
		Scanner intScan = new Scanner(System.in);
		int input; // store user input
		int elementOne = 0; // element one of the series
		int elementTwo = 1; // element two of the series
		int result; // store result of calculation before outputting
		
		//get input
		System.out.println("This program takes a positive number as input and prints that many elements of the Fibonacci series.");
		
		do {
			System.out.print("Enter a positive integer: ");
			input = intScan.nextInt();
			if (input <= 0) {
				System.out.print("Error! Negative number detected! ");
			}
		} while (input <= 0);
		
		if (input == 1) {
			// no calculation needed
			System.out.println(0);
		}
		else if (input == 2) {
			// no calculation needed
			System.out.println("0\n1");			
		}
		else {
			// do the calculation
			for (int i = 0; i < input; i++) {
				if (i <= 1) {
					result = i;
				}
				else {
					result = elementOne + elementTwo;
					elementOne = elementTwo;
					elementTwo = result;
				}
				System.out.println(result);
				
				
			}			
		}
		// end of program message
		System.out.println("Thanks for playing!");
		
		// close Scanner
		intScan.close();
	}

}
