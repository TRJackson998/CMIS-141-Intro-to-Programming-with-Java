/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.5.2022 
 * (1) Prompts a user to enter two numbers between 200 and 1000 
 * 		and a symbol for operation such as ‘+’, ‘-‘, ‘*’,and ‘/’ (use Scanner for input).
 * (2) Code uses nested if statement or switch to perform the operation on the two numbers
 * (3) If the provided symbol is valid, 
 * 		displays the input data along with the result of the calculation to the console. 
 * 		Otherwise displays an error message

 */
import java.util.Scanner;
public class AssignmentTwo {
	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.5.2022.\n");
		
		//declare variables
		Scanner intScan = new Scanner(System.in);
		Scanner charScan = new Scanner(System.in);
		int firstNum;
		int secondNum;
		char operation;
		double result = -1;
		boolean validOperation = false;
		boolean validNums = false;
		
		//get input
		System.out.println("This program takes in two numbers and an operation and returns the result.");
		System.out.print("First number: ");
		firstNum = intScan.nextInt();
		System.out.print("Second number: ");
		secondNum = intScan.nextInt();
		System.out.print("Operation (+, -, *, /): ");
		operation = charScan.next().charAt(0);
		System.out.print("\n");
		
		//validate input - operation
		switch (operation) {
		case '+':
		case '-':
		case '/':
		case '*':
			validOperation = true;
			break;
		default:
			validOperation = false;
		}
		
		//validate input - numbers: valid if between 200 and 1000 inclusive
		if (firstNum > 199 && firstNum < 1001 && secondNum > 199 && secondNum < 1001) {
			//validNums default is false, only gets to true if all conditions pass
			validNums = true;
		}
		
		//do calculation if valid, else print error message
		if (validOperation && validNums) {
			//do calculation
			switch (operation) {
			case '+':
				result = firstNum + secondNum;
				break;
			case '-':
				result = firstNum - secondNum;
				break;				
			case '/':
				result = (double)firstNum / secondNum;
				break;
			case '*':
				result = firstNum * secondNum;
				break;				
			}
			//return result to console
			System.out.printf("The result is: %.1f\n", result);
		} else {
			//invalid input, print error messages
			if (!validOperation) {
				System.out.printf("Invalid operation input: %s\n", operation);
			}
			if (!validNums) {
				System.out.printf("Invalid number input: %d, %d\n", firstNum, secondNum);
			}
		}

		//close Scanners
		intScan.close();
		charScan.close();
	
	}

}
