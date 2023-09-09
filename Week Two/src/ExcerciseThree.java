/*
 * Program which prompts user for a sentence 
 * and prints it back to the console.
 */

import java.util.Scanner;

public class ExcerciseThree {
	
	public static void main(String[] args) {
		//declare variables
		Scanner strScan = new Scanner(System.in);
		String inStr;
		
		//get input
		System.out.print("Enter a sentence: ");
		inStr = strScan.nextLine();
		
		//print output
		System.out.print("Entered: " + inStr);

		//close Scanner object
		strScan.close();
		
	}
}
