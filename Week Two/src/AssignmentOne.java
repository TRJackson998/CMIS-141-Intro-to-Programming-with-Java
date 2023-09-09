/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 10.30.2022 
 * Prompts a user to enter 
 * 	customer id, 
 * 	unit price in this format (e.g. 3.75), 
 * 	quantity (as wholenumber), 
 * 	product description, 
 * 	and discount in this format (e.g., .10) 
 * Calculates the customer's overall order total before and after discount.
 * Displays the input data along with the order total before and after the discount to the console.
 */
import java.util.Scanner;

public class AssignmentOne {
	public static void main(String[] args) {
		//header
		System.out.println("Jackson, Terrence. CMIS 141 7383. 10.30.2022.\n");
		
		//declare variables
		Scanner intScan = new Scanner(System.in);
		Scanner doubleScan = new Scanner(System.in);
		Scanner strScan = new Scanner(System.in);
		int custID; // number associated with customer
		double unitPrice; // price of one product
		int quantity; // number of products purchased
		String productDesc; // description of product
		double discount; // percent discount as .10 = 10%
		double beforePrice; // price before discount
		double afterPrice; // price after discount
		
		//get input
		System.out.println("This program takes in customer and purchase information and returns total costs.");
		System.out.print("Enter customer id: ");
		custID = intScan.nextInt();
		System.out.print("Enter unit price in decimal format (e.g. 3.5): ");
		unitPrice = doubleScan.nextDouble();
		System.out.print("Enter quantity: ");
		quantity = intScan.nextInt();
		System.out.print("Enter product description: ");
		productDesc = strScan.nextLine();
		System.out.print("Enter discount in decimal format (e.g. .05): ");
		discount = doubleScan.nextDouble();
		
		//do the calculation
		beforePrice = (unitPrice * quantity);
		afterPrice = (unitPrice * quantity) * 1 - (unitPrice * quantity) * discount;
		
		//print output
		System.out.print("\n\n");
		System.out.println("ORDER DATA");
		System.out.println("Customer ID: " + custID);
		System.out.printf("Unit Price: %.2f\n", unitPrice);
		System.out.println("Quantity: " + quantity);
		System.out.println("Product Description: " + productDesc);
		System.out.println("Discount: " + discount * 100 + "%");
		System.out.print("\n\n");
		System.out.printf("Order Total BEFORE discount: %.2f\n", beforePrice);
		System.out.printf("Order Total AFTER discount: %.2f\n", afterPrice);
		
		//close Scanner
		intScan.close();
		doubleScan.close();
		strScan.close();
	}
}
