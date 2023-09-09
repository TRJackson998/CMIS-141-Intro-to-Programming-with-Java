/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.26.2022
 * Reply to another student's post. 
 * Modify the student's program by adding another method to be called 
 * for the same input and add another print statement with the returned result. 
 * Submit a screen shot of the execution of the modified code.
 */
import java.util.Scanner;
public class DiscussionSixReply {
	public static void main(String[] args) {
		
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.26.2022.\n");
		
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Display a welcome message
		System.out.println("This program takes two numbers, calls a method to manipulate the numbers, and prints the results");
		
		//Get the numbers from the user and store them in variables
		System.out.print("Enter two numbers: ");
		double num1 = input.nextInt();
		double num2 = input.nextInt();
		
		//Call the method
		double value1 = multiplyNumbers(num1,num2);
		double value2 = powerNumbers(num1, num2);
		
		//Display the results
		System.out.println("The product of " + num1 + " and " + num2 + " is: " + value1);
		System.out.println(num1 + " to the power of " + num2 + " is: " + value2);
		
		//Close the Scanner
		input.close();
	}

	public static double multiplyNumbers(double x, double y) {
		
		//calculate the value
		double value = x * y;
		
		//return the value
		return value;
	}
	public static double powerNumbers(double x, double y) {
		//calculate the value
		double value = 1;
		for (int i = 0; i < y; i++) {
			value = value * x;
		}
		
		//return the value
		return value;		
	}
}
