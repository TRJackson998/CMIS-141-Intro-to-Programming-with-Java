/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 11.09.2022
 * (1) Prompt and read user’s input for the 
 * 		gamer's name, 
 * 		Level 1 XP (L1), 
 * 		Level 2 XP (L2),
 * 		Level 3 XP (L3), 
 * 		and Engagement score (ES). 
 * (2) Each XP score input should be in whole numbers between 10-100 and in increments of 5. 
 * 		The total XP score with bonuses should be calculated as follows:
 * 		L1+L1*0.20+L2+L2*0.30+L3+L3*0.50+ES+ES*0.60
 * (3) Output the gamer's information and the total calculated XP score (including bonuses).
 * (4) Prompt the user as to whether they want to calculate total XP for another gamer and repeat the input/output processing
 * (5) Allow user to exit the program without inputting gamer's data
 */
import java.util.Scanner;
public class AssignmentThree {
	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 11.09.2022.\n");
		
		//declare vars
		Scanner strScan = new Scanner(System.in);
		Scanner intScan = new Scanner(System.in);
		String name; //input gamer's name
		int levelOneScore; //input L1 score
		int levelTwoScore; //input L2 score
		int levelThreeScore; //input L3 score
		int engScore; //input engagement score
		double finalScore; //store result of XP calculation
		String cont; //store yes/no for continuing the program
		String contMessage = new String("Do you want to enter gamer's data? Yes/No =>");
		
		//welcome message, init cont
		System.out.println("Welcome to the Total XP calculation program!");
		System.out.print(contMessage);
		cont = strScan.nextLine();
		
		
		
		//while loop to get input while user says they want to continue
		while (cont.equalsIgnoreCase("Yes")) {
			//proceed w/program
			
			//prompt for input
			System.out.print("Enter gamer's name =>");
			name = strScan.nextLine();
			System.out.print("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES => ");
			levelOneScore = intScan.nextInt();
			levelTwoScore = intScan.nextInt();
			levelThreeScore = intScan.nextInt();
			engScore = intScan.nextInt();
			
			//validate input
			while(
					(levelOneScore < 10 || levelOneScore > 100 || levelOneScore % 5 != 0) || 
					(levelTwoScore < 10 || levelTwoScore > 100 || levelTwoScore % 5 != 0) ||
					(levelThreeScore < 10 || levelThreeScore > 100 || levelThreeScore % 5 != 0) ||
					(engScore < 10 || engScore > 100 || engScore % 5 != 0)
					) {
				if(levelOneScore < 10 || levelOneScore > 100 || levelOneScore % 5 != 0) {
					System.out.println("Invalid L1 score, must be between 10-100 and in increments of 5.");
					System.out.printf("You input: %d\n", levelOneScore);
					System.out.print("Please re-enter gamer's Level 1 XP score =>");
					levelOneScore = intScan.nextInt();					
				}
				if (levelTwoScore < 10 || levelTwoScore > 100 || levelTwoScore % 5 != 0) {
					System.out.println("Invalid L2 score, must be between 10-100 and in increments of 5.");
					System.out.printf("You input: %d\n", levelTwoScore);
					System.out.print("Please re-enter gamer's Level 2 XP score =>");
					levelTwoScore = intScan.nextInt();					
				}
				if (levelThreeScore < 10 || levelThreeScore > 100 || levelThreeScore % 5 != 0) {
					System.out.println("Invalid L3 score, must be between 10-100 and in increments of 5.");
					System.out.printf("You input: %d\n", levelThreeScore);
					System.out.print("Please re-enter gamer's Level 3 XP score =>");
					levelThreeScore = intScan.nextInt();
				}
				if (engScore < 10 || engScore > 100 || engScore % 5 != 0) {
					System.out.println("Invalid ES score, must be between 10-100 and in increments of 5.");
					System.out.printf("You input: %d\n", engScore);
					System.out.print("Please re-enter gamer's Engagement score =>");
					engScore = intScan.nextInt();
				}
			}			

			//do calculation
			finalScore = levelOneScore + levelOneScore*0.20 + 
					levelTwoScore + levelTwoScore*0.30 + 
					levelThreeScore + levelThreeScore*0.50 + 
					engScore + engScore*0.60;
			
			//display output
			System.out.printf("\n\nGamer Name: %s L1=%d L2=%d L3=%d ES=%d\n", name, levelOneScore, levelTwoScore, levelThreeScore, engScore);
			System.out.printf("Final XP score with bonuses=%.0f\n", finalScore);
			
			//update loop condition var
			System.out.print(contMessage);
			cont = strScan.nextLine();
		}
		
		System.out.println("Thank you for using the Total XP calculation program!");	
		
		//close Scanners
		strScan.close();
		intScan.close();
		
	}

}
