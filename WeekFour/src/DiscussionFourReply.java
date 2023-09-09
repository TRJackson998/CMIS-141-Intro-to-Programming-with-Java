/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.09.2022
 * Write a Java program which contains a while loop. Prompt user for input which determines the number of times the loop repeats. 
 * The program should display some output for each iteration but it should be more than just an increment.
 */
import java.util.Scanner;
public class DiscussionFourReply {

	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.09.2022.\n");
		
		Scanner scanner = new Scanner(System.in); //Create Scanner

		//welcome message
		System.out.println("This program will display the square of every number between the two entered by the user");
		
		//Get user input
		System.out.print("Enter two numbers separated by a space:  ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		//loop to square numbers and display the output
		do {
			int numSquared = num1 * num1;
			System.out.println(num1 + " squared is: " + numSquared);
			num1++;			
		} while(num1 <= num2);
		scanner.close();

	}

}
