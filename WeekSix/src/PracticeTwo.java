/*
 * Write a method that takes 3 numbers and return the average. 
 * Write test code that calls the method and prints the returned value to the console.
 */

public class PracticeTwo {

	public static double getAverage(int numOne, int numTwo, int numThree) {
		double average;
		
		average = (numOne + numTwo + numThree)/3;
		
		return average;
	}
	
	public static void main(String[] args) {
		double average;
		average = getAverage(10, 20, 30);
		System.out.println(average);

	}

}
