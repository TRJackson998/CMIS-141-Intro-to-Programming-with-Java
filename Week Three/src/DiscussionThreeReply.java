/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.2.2022 
 * Write a Java program which prompts a user for input 
 * and depending on that input prints a different value to the console
 * use if-else statement in your program.
 */

import java.util.Scanner;
public class DiscussionThreeReply {

	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.2.2022.\n");
		
        // Initialize variables
        int numberOfDrinks;
        String user;

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);

        // Declaring Variables
        System.out.println("Enter how many drinks do you have in a week?!");
        numberOfDrinks = scanner.nextInt();

        // Conditional operator, stored as user
        if (numberOfDrinks < 5) {
        	user = "\nA few beers never hurt nobody!";
        }
        else if (numberOfDrinks <= 10 ){
        	user = "\nAhhhhh, Someone who likes to party!";
        }
        else {
        	user = "\nYou really know how to party!";
        }

        // Output, prints user which is determined by the input
        System.out.println(user);

        // Close scanner
        scanner.close();

	}

}
