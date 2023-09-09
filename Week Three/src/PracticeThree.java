/*
 * Write Java program to prompt user for temperature and isSunny value
 * and use if statement to print to the console the literal “Let’s go out” when variable
 * temperature ranges between 65 and 80 and otherwise prints “Let’s stay in”
 */

import java.util.Scanner;
public class PracticeThree { 
	public static void main(String[] args) {
		//declare variables
		int temp;
		Scanner intScan = new Scanner(System.in);
		
		//get input
		System.out.print("What is the temperature? (F): ");
		temp = intScan.nextInt();
		
		//conditional
		if (temp >= 65 && temp <= 80) {
			System.out.println("Let's go out!");
		} else {
			System.out.println("Let's stay inside!");
		}
		
		//close Scanners
		intScan.close();
	}
}