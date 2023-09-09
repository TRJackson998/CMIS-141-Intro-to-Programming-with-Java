import java.util.Scanner;

public class Week_2_Disc_Reply {

	public static void main(String[] args) {

		// variables
		int curyr, bthyr;

		Scanner in = new Scanner(System.in);
		System.out.print("Type the current year: ");

		curyr = in.nextInt();
		System.out.print("Type in the year you were born: ");

		bthyr = in.nextInt();
		int age = curyr - bthyr;

		System.out.print("You are or you will be ");
		System.out.print(age);
		System.out.print(" this year");

		in.close();
	}

}
