/*
 * Write Java program to prompt user for temperature and isSunny value
 * and use if statement to print to the console the literal “Let’s go out” when variable
 * temperature is greater or equal to 70 OR isSunny has the value true
 */

import java.util.Scanner;
public class PracticeTwo { 
	public static void main(String[] args) {
		//declare variables
		int temp;
		boolean sunny;
		Scanner intScan = new Scanner(System.in);
		Scanner boolScan = new Scanner(System.in);
		
		//get input
		System.out.print("What is the temperature? (F): ");
		temp = intScan.nextInt();
		System.out.print("Is it sunny today? (true/false): ");
		sunny = boolScan.nextBoolean();
		
		//conditional
		if (temp >= 70 || sunny == true) {
			System.out.println("Let's go out!");
		} else {
			System.out.println("Let's stay inside!");
		}
		
		//close Scanners
		intScan.close();
		boolScan.close();
	}
}