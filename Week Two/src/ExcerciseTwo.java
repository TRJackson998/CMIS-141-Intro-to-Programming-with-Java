/*
 * Program which prompts user for two integers, 
 * increments them by one
 * and prints each on a separate line to the console.
 */
import java.util.Scanner;

public class ExcerciseTwo {
	
	public static void main(String[] args) {
		//declare variables
		Scanner intScan = new Scanner(System.in);
		int intOne;
		int intTwo;
		
		//get input
		System.out.println("This program takes in two numbers and increments them.");
		System.out.print("Enter two integers separated by space: ");
		intOne = intScan.nextInt();
		intTwo = intScan.nextInt();
		
		//print output
		System.out.println(intOne + " + 1 = " + ++intOne);
		System.out.println(intTwo + " + 1 = " + ++intTwo);

		//close Scanner object
		intScan.close();
	}
}
