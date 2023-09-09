/*
 * Write a method that gets two integers as parameters, 
 * and prints all the integer values between those two integers, 
 * including the starting value but excluding the ending value. 
 * Write test code that calls the method.
 */

public class PracticeOne {

	public static void printBetween(int numOne, int numTwo) {
		for (int i = numOne; i < numTwo; i++) {
			System.out.printf("%d ", i);
		}
	}
	
	public static void main(String[] args) {
		printBetween(10, 20);

	}

}
