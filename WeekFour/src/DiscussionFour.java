/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.09.2022
 * Write a Java program which contains a while loop. Prompt user for input which determines the number of times the loop repeats. 
 * The program should display some output for each iteration but it should be more than just an increment.
 */

import java.util.Scanner;
public class DiscussionFour {

	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.09.2022.\n");
		
		//declare variables
		Scanner strScan = new Scanner(System.in);
		String input; //user input string
		int count;
		
		//get input
		System.out.print("This program asks for a word or phrase until the user inputs one that is an acceptable password/passphrase.");
		System.out.print("Enter a word or phrase: ");
		input = strScan.nextLine();
		
		//loop until an acceptable word is input
		while ((input.length() < 10) || (input.length() > 20)) {
			//if input was too short
			if (input.length() < 10) {
				//fill in the remaining chars with stars
				while (input.length() < 10) {
					input += "*";
				}
				//inform the user and get new input
				System.out.printf("The word/phrase you entered is: %s\n", input);
				System.out.print("This word/phrase is too short to be secure. Please enter a word/phrase that is 10 or more characters: ");
				input = strScan.nextLine();
			}
			//if the input was too long
			else {
				//cover up the extra chars with _
				count = input.length() - 20;
				while (input.length() > 20) {
					input = input.substring(0, input.length() - 2);
				}
				while (count > 0) {
					input += '_';
					count--;
				}
				//inform the user and get new input
				System.out.printf("The word/phrase you entered is: %s\n", input);
				System.out.print("This word/phrase is too long to be remembered. Please enter a word/phrase that is 20 or less characters: ");
				input = strScan.nextLine();				
			}
		}
		//escaped while, good input
		System.out.printf("The word/phrase you entered is: %s\n", input);
		System.out.println("This password/passphrase is a good length\n");
			
	strScan.close();
	}
	
}
