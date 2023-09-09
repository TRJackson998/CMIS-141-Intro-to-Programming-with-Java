/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 10.19.2022
 * Write a Java program which assigns your name to one variable 
 * and some other numerical value you want to share to another variable 
 * (e.g. age, number of pets,  number of children, etc.). 
 * Then print a greeting along with the value of the name variable to the screen
 * on one line and a message that uses the other variable with numerical value to another line.
 */
public class VariablesAndOutput {
	public static void main(String[] args) {
		String MyName = "Terrence Jackson"; //my first and last name
		int NumPets = 3; //the number of pets I have
		System.out.println("Jackson, Terrence. CMIS 141 7383. 10.19.2022.");
		System.out.println("Welcome to CMIS 141! My name is " + MyName + ".");
		System.out.println("I have " + NumPets + " cats.");
	}
}
