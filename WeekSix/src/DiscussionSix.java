/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.24.2022
 * Write a Java program which prompts user for at least two input values. 
 * Then write a method which gets those input values as parameters and does some calculation/manipulation with those values. 
 * The method then should return a result of the calculation/manipulation. 
 * The program should prompt user, call the method, and then print a meaningful message along with the value returned from the method.
 */
import java.util.Scanner;
public class DiscussionSix {
	
	public static int getFirstInput(Scanner intScan) {
		//prompts for, verifies, and returns first input for program
		int selection;
		
		//prompt for input
		System.out.println("Select from one of the following statements...");
		System.out.println("1. The Java programming language was originally named Oak.");
		System.out.println("2. The Java programming language was created in 1998.");
		System.out.println("3. The Java programming language was based on C/C++ concepts.");
		System.out.print("Enter a number to make your selection: ");
		selection = intScan.nextInt();
		
		//verify input
		while ((selection < 1) | (selection > 3)) {
			System.out.print("Error! Enter a number to make your selection: ");
			selection = intScan.nextInt();
		}
		
		return selection;
	}
	
	public static boolean intToBool(int input) {
		boolean output;
		
		//convert int to boolean
		if (input == 1) {
			output = true;
			
		} else {
			output = false;
		}
		
		return output;
	}
	
	public static boolean getSecondInput(Scanner intScan) {
		//prompts for, verifies, and returns first input for program
		int input;
		boolean correct;
		
		//prompt for input
		System.out.print("Is the statement you selected correct? Input 1 for True and 0 for False: ");
		input = intScan.nextInt();
		
		//verify input
		while ((input != 1) & (input != 0)) {
			System.out.print("Error! Enter 1 for True and 0 for False: ");
			input = intScan.nextInt();
		}
		
		//convert to a boolean using helper function
		correct = intToBool(input);
		
		return correct;
	}
	
	public static boolean determineAccuracy(int selection, boolean correct) {
		//correct is the guess the user made
		boolean accurate = false;
		switch (selection) {
			case 1:
				//selection 1 was an accurate statement, if the user said it was correct then they were right
				if (correct) {
					accurate = true;
				}
				break;
			case 2:
				//selection 2 was not an accurate statement, if the user said it was not correct then they were right
				if (!correct) {
					accurate = true;
				}
				break;
			case 3:
				//selection 3 was an accurate statement, if the user said it was correct then they were right
				if (correct) {
					accurate = true;
				}
				break;
		}
		//accurate only gets set to true if the case statement if block passes
		//else it's still at default false
		return accurate;
	}

	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.24.2022.\n");
		
		//declare variables
		Scanner intScan = new Scanner(System.in);
		int selection;
		boolean guess;
		boolean correct;
		
		//use methods to get input and determine output
		selection = getFirstInput(intScan);
		guess = getSecondInput(intScan);
		correct = determineAccuracy(selection, guess);
		
		//print out result to user
		if (correct) {
			System.out.println("You guessed correctly!");
		} else {
			System.out.println("You guessed incorrectly!");
		}
		
		//close Scanner
		intScan.close();

	}

}
