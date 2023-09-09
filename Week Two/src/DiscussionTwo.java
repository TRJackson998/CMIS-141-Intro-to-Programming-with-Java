/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 10.30.2022 
 * Write a Java program which prompts a user for two numerical values as input,
 * does some calculation on them 
 * and then print the result along with meaningful message to the console. 
 * Use some interesting formula and not a simple summation.
 */
import java.util.Scanner;

public class DiscussionTwo {
	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 10.19.2022.\n");
		
		//declare variables
		Scanner doubleScan = new Scanner(System.in);
		double radius; //radius of the sphere
		double area; //storage for the calculation
		
		//get input
		System.out.println("This program takes in a radius and returns the volume of the sphere");
		System.out.print("Enter a radius (in): ");
		radius = doubleScan.nextDouble();
		
		//do the calculation
		area = (4/3) * 3.14159 * (radius * radius * radius);
		
		//print output
		System.out.println("The area is: " + area + " cubic inches");
		
		//close Scanner
		doubleScan.close();
	}
}
