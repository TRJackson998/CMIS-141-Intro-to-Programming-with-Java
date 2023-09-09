/*
 * Prompt user for the number of students. 
 * For each student prompt for 3 quiz grades, 
 * calculate and display the quiz values and quiz average. 
 * Use nested for-loop in your code.
 */
import java.util.Scanner;
public class PracticeTwo {

	public static void main(String[] args) {
		Scanner intScan = new Scanner(System.in);
		int numStudents;
		
		do {
			System.out.print("Enter a positive integer: ");
			numStudents = intScan.nextInt();
			if (numStudents < 0) {
				System.out.print("Error! Negative number detected! ");
			}
		} while (numStudents < 0);
		
		for (int i = 0; i < numStudents; i++) {
		}
		
		intScan.close();

	}

}
