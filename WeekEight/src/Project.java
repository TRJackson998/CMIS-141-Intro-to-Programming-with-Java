
/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 12.10.2022
 * 1. Add multiple new customers - 
 *      prompt user for the number of customers to be loaded and then
 *      prompts for each customer's name, customer id (5 digit number), and total sales
 * 2. Add single new customer - 
 *      prompts the user for customer data: customer name, customer id, and total sales
 * 3. Display all customers - 
 *      displays each customer's data to the console, one customer per line
 * 4. Retrieve specific customer's data - 
 *      prompts the user for the customer id and displays the corresponding customer's data: 
 *          customer id, 
 *          customer name, 
 *          and total sales
 * 5. Retrieve customers with total sales based on the range - 
 *      prompts the user for the lowest and highest total sales and 
 *      displays all customers with total sales in that range. 
 *      Display each customer on a separate line with all information – 
 *          Customer Name, 
 *          Customer ID, 
 *          and Total Sales
 * 6. Exit
 */
import java.util.Scanner;

class Customer {
    // private class vars
    private int id;
    private String name;
    private double totalSales;

    // default constructor
    public Customer() {
        this.id = 00000;
        this.name = "Jane Doe";
        this.totalSales = 0;
    }

    // constructor
    public Customer(int id, String name, double totalSales) {
        this.id = id;
        this.name = name;
        this.totalSales = totalSales;
    }

    // getters
    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getTotalSales() {
        return this.totalSales;
    }

    // setters
    public void setID(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    // display customer
    public void displayCustomer() {
        System.out.print("Customer " + this.id);
        System.out.print(" (name: " + this.name);
        System.out.print(", sales: $" + this.totalSales);
        System.out.println(")\n");
    }

}

class Customers {
    // private class variables
    private int numCustomers;
    private Customer[] customers;

    // default constructor
    public Customers() {
        customers = new Customer[100];
    }

    // getters
    public int getNumCustomers() {
        return this.numCustomers;
    }

    public Customer[] getCustomers() {
        return this.customers;
    }

    public Customer getCustomer(int i) {
        return this.customers[i];
    }

    // setter
    public void addCustomer(int id, String name, double totalSales) {
        this.customers[numCustomers] = new Customer(id, name, totalSales);
        this.numCustomers += 1;
    }

    // display customers
    public void displayCustomers() {
        for (int i = 0; i < numCustomers; i++) {
            customers[i].displayCustomer();
        }
        System.out.println();
    }
}

public class Project {

    public static void addMultiple(Customers customers, Scanner intScanner, Scanner doubleScanner,
            Scanner stringScanner) {
        // declare variables
        int numCustomers;
        int custId;
        String name;
        double sales;

        System.out.print("How many customers: ");
        numCustomers = intScanner.nextInt();

        for (int i = 0; i < numCustomers; i++) {
            // get cust info
            System.out.printf("Customer %d:\n", i);
            System.out.print("\tID: ");
            custId = intScanner.nextInt();
            System.out.print("\tName: ");
            name = stringScanner.nextLine();
            System.out.print("\tTotal Sales: $");
            sales = doubleScanner.nextDouble();
            System.out.println();

            // add cust to array
            customers.addCustomer(custId, name, sales);
        }

    }

    public static void addOne(Customers customers, Scanner intScanner, Scanner doubleScanner, Scanner stringScanner) {
        // declare variables
        int custId;
        String name;
        double sales;

        // get cust info
        System.out.printf("Customer:\n");
        System.out.print("\tID: ");
        custId = intScanner.nextInt();
        System.out.print("\tName: ");
        name = stringScanner.nextLine();
        System.out.print("\tTotal Sales: $");
        sales = doubleScanner.nextDouble();
        System.out.println();

        // add cust to array
        customers.addCustomer(custId, name, sales);
    }

    public static void displayAll(Customers customers) {
        customers.displayCustomers();
    }

    public static void displayOne(Customers customers, Scanner intScanner) {
        // variables
        int custId;
        Customer thisCust;

        // get input
        System.out.print("\tID: ");
        custId = intScanner.nextInt();

        // display customer
        for (int i = 0; i < customers.getNumCustomers(); i++) {
            thisCust = customers.getCustomer(i);
            if (thisCust.getID() == custId) {
                thisCust.displayCustomer();
            }
        }
    }

    public static void displayRange(Customers customers, Scanner doubleScanner) {
        // variables
        double loSales;
        double hiSales;
        Customer thisCust;

        // get input
        System.out.print("Lowest sales: $");
        loSales = doubleScanner.nextInt();
        System.out.print("Highest sales: $");
        hiSales = doubleScanner.nextInt();

        // display customers
        for (int i = 0; i < customers.getNumCustomers(); i++) {
            thisCust = customers.getCustomer(i);
            if ((thisCust.getTotalSales() <= hiSales) & (thisCust.getTotalSales() >= loSales)) {
                thisCust.displayCustomer();
            }
        }
    }

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 141 7383. 12.10.2022.\n");

        // variables
        int selection;
        String menu;
        Scanner intScanner = new Scanner(System.in);
        Customers customers = new Customers();
        Scanner doubleScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        // create menu
        menu = new String(
                "\tMENU\n"
                        + "1: Add multiple new customers\n"
                        + "2: Add single new customers\n"
                        + "3: Display all customers\n"
                        + "4: Retrieve specific customer data\n"
                        + "5: Retrieve customers with orders based on range\n"
                        + "9: Exit program\n"
                        + "\n"
                        + "Enter your selection: ");

        // display menu, get first input
        System.out.print(menu);
        selection = intScanner.nextInt();

        // loop until user stops
        while (((selection < 6) & (selection > 0)) & (selection != 9)) {
            switch (selection) {
                case 1:
                    addMultiple(customers, intScanner, stringScanner, doubleScanner);
                    break;
                case 2:
                    addOne(customers, intScanner, stringScanner, doubleScanner);
                    break;
                case 3:
                    displayAll(customers);
                    break;
                case 4:
                    displayOne(customers, intScanner);
                    break;
                case 5:
                    displayRange(customers, doubleScanner);
                    break;
            }

            // get next input
            System.out.print(menu);
            selection = intScanner.nextInt();
        }

        System.out.println("Thank you for using this program. Goodbye!");

        // close Scanner
        intScanner.close();
        doubleScanner.close();
        stringScanner.close();

    }
}
