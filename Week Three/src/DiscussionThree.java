/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.2.2022 
 * Write a Java program which prompts a user for input 
 * and depending on that input prints a different value to the console
 * use if-else statement in your program.
 */
import java.util.Scanner;

public class DiscussionThree {
	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.2.2022.\n");
		
		//declare variables
		int foodTemp;
		Scanner intScan = new Scanner(System.in);
		
		//get input
		System.out.println("This program tells you if your chicken is fully cooked.");
		System.out.print("What is the temperature of your chicken? (F): ");
		foodTemp = intScan.nextInt();
		
		//conditional
		if (foodTemp < 165) {
			System.out.println("Keep cooking your chicken!");
		}
		else if (foodTemp == 165){
			System.out.println("Your food is perfectly cooked!");
		}
		else {
			System.out.println("Your food is overcooked!");
		}
		
		//close Scanner
		intScan.close();
		
	}
}
