/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.19.2022
 */
import java.util.Scanner;
public class DiscussionFiveReply {
	public static void main(String[] args) { 
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.19.2022.\n");
		
		//declare variables
		Scanner sc = new Scanner(System.in);
		int a; //The input will be stored in a.
				  
		// prompts to collect user input
		System.out.print("How many times do you want the loop to run? Enter a No.   ");
		 a = sc.nextInt();
		 
		// for loop
		for (int i = 1; i <=a; i++) {
			if (a % 2 == 0) {
				System.out.println(++i);
			}
			else {
				System.out.println(i++);
			}
		}
		System.out.println("Completed Loop!");
	sc.close();
	}
}
