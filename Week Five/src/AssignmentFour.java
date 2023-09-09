/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.24.2022
 * 
 * Write Java code to prompt the user for the number of rows (e.g. 7) 
 * and output the triangle pattern below using nested for-loops.
 * 
 * Write Java code to prompt the user for the starting number to print (e.g. 5) 
 * and output rectangular pattern below: Use nested for-loops
 */
import java.util.Scanner;
public class AssignmentFour {

	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.24.2022.\n");
		
		//init vars
		Scanner intScan = new Scanner(System.in);
		int input; // store user input
		
		//get triangle input
		System.out.print("Enter a number of rows: ");
		input = intScan.nextInt();
		
		//output triangle pattern
		for (int i = 0; i < input; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println();
		
		//get square input
		System.out.print("Enter a number: ");
		input = intScan.nextInt();
		
		//output square pattern
		for (int row = input; row > 0; row--) {
			for (int col = input; col > 0; col--) {
				if (col > row) {
					System.out.printf("%d ", col);
				}
				else {
					System.out.printf("%d ", row);
				}
			}
			for (int col = 2; col <= input; col++) {
				if (col > row) {
					System.out.printf("%d ", col);
				}
				else {
					System.out.printf("%d ", row);
				}
			}			
			System.out.println();
		}
		for (int row = 2; row <= input; row ++) {
			for (int col = input; col > 0; col--) {
				if (col > row) {
					System.out.printf("%d ", col);
				}
				else {
					System.out.printf("%d ", row);
				}
			}
			for (int col = 2; col <= input; col++) {
				if (col > row) {
					System.out.printf("%d ", col);
				}
				else {
					System.out.printf("%d ", row);
				}
			}			
			System.out.println();
		}		
		
		// close Scanner
		intScan.close();		
	}

}
