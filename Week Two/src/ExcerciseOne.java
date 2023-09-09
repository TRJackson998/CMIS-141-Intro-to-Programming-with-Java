/*
 * Program which prompts user for two numbers, 
 * multiplies them together 
 * and prints the result to the console.
 */
import java.util.Scanner;
public class ExcerciseOne {

	public static void main(String[] args) {
		//Declare variables
		Scanner doubleScan = new Scanner(System.in);
		double numOne;
		double numTwo;
		
		//prompt for input
		System.out.println("This program takes two input numbers and returns the result of their multiplication.");
		System.out.print("Enter two numbers separated by space: ");
		numOne = doubleScan.nextDouble();
		numTwo = doubleScan.nextDouble();
		System.out.println(numOne + " * " + numTwo + " = " + numOne*numTwo);
		doubleScan.close();
		
	}

}
