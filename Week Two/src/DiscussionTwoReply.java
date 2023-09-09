import java.util.Scanner;


public class DiscussionTwoReply {

	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 10.30.2022.\n");
		
		//variables
		int curyr , bthyr, tenyrs;
		
		 
		Scanner in = new Scanner(System.in);
		System.out.print("Type the current year: ");
		
		curyr = in.nextInt();
		System.out.print("Type in the year you were born: ");
		
		bthyr = in.nextInt();
		int age	=  curyr - bthyr;
		
		tenyrs = age + 10;
		
	 
		System.out.print("You are or you will be " );
		System.out.print(age);
		System.out.print(" this year");
		
		System.out.print("\nIn ten years you will be " );
		System.out.println(tenyrs);
		System.out.println("\nHi Steve, I'm Terrence! I like your program");
		
		in.close();
		
		
	}

}
