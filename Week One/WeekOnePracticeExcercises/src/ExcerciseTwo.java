/*
 * Declare a variable to store book title, 
 * another to store the number of pages, 
 * and last one to store the book’s price. 
 * Assign the following values to the variables: “Black Dawn”, 567, and 9.99. 
 * Print the values of the three variables to the console on the same line with meaningful labels.
 */

public class ExcerciseTwo {
	
	public static void main(String[] args) {
		String BookTitle = "Black Dawn";
		int NumPages = 567;
		double Price = 9.99;
		System.out.print("Book Title=\"" + BookTitle + "\" ");
		System.out.print("Number of pages=\"" + NumPages + "\" ");
		System.out.print("Price=$" + Price);
	}
}
