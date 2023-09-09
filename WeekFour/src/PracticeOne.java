/*
 * Prompt user for an integer 
 * and then print the below pattern using nested while loops.
 * Enter integer value: 5
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 */

import java.util.Scanner;
public class PracticeOne {

	public static void main(String[] args) {
		//declare variables
		Scanner intScan = new Scanner(System.in);
		int input;
		int outerCount = 1;
		int innerCount;
		
		//get input
		System.out.print("Enter a number: ");
		input = intScan.nextInt();
		
		//do the thing
		while (outerCount <= input) {
			innerCount = 1;
			while(innerCount <= outerCount) {
				System.out.printf("%d ", innerCount);
				innerCount++;
			}
			System.out.print("\n");
			outerCount++;
		}
		intScan.close();
	}

}
