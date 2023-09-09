/*
 * Prompt user for two even integers and print all even values between those two using while loop.
 */
import java.util.Scanner;
public class PracticeTwo {

	public static void main(String[] args) {
		//declare vars
		Scanner intScan = new Scanner(System.in);
		int inputOne;
		int inputTwo;
		
		//get input
		System.out.print("Enter two integers, separated by a space: ");
		inputOne = intScan.nextInt();
		inputTwo = intScan.nextInt();
		
		//do the thing
		while (inputOne < (inputTwo - 1)) {
			inputOne++;
			if (inputOne % 2 == 0) {
				System.out.print("\n");
				System.out.print(inputOne);
			}
			
		}
		intScan.close();
	}

}
