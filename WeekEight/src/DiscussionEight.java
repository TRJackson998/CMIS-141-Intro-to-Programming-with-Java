/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 12.9.2022
 * Write a Java class which models a household appliance (Refrigerator). 
 * Your class should have at least two meaningful attributes, 
 * one method to do some action on or for the object, 
 * and one method to display the values of the attributes to the console. 
 * In your main method create an instance of the object and call your methods.
 */

class Refrigerator {
    // Refrigerator class variables
    private String brand;
    private int numShelves;
    private String[] shelves;
    private int numDrawers;
    private String[] drawers;
    private boolean closed;
    private boolean running;

    // Refrigerator class deault constructor
    public Refrigerator() {
        this.brand = "LG";
        this.numShelves = 0;
        this.shelves = new String[5];
        this.numDrawers = 0;
        this.drawers = new String[3];
        this.closed = true;
        this.running = false;
    }

    // Refrigerator class constructor
    public Refrigerator(String brand, int numShelves, int numDrawers, boolean closed, boolean running) {
        this.brand = brand;
        this.numShelves = numShelves;
        this.shelves = new String[5];
        this.numDrawers = numDrawers;
        this.drawers = new String[3];
        this.closed = closed;
        this.running = running;
    }

    // Refrigerator class methods //
    // setter and getter for brand
    public void setBrand(Refrigerator fridge, String brand) {
        this.brand = brand;
    }

    public String getBrand(Refrigerator fridge) {
        return this.brand;
    }

    // setters and getter for closed
    public void openFridge(Refrigerator fridge) {
        this.closed = false;
    }

    public void closeFridge(Refrigerator fridge) {
        this.closed = true;
    }

    public boolean didICloseTheRefrigerator(Refrigerator fridge) {
        return this.closed;
    }

    // setters and getter for running
    public void turnOnFridge(Refrigerator fridge) {
        this.running = true;
    }

    public void turnOffFridge(Refrigerator fridge) {
        this.running = false;
    }

    public boolean isYourRefrigeratorRunning(Refrigerator fridge) {
        return this.running;
    }

    // methods to add shelves and drawers
    public void addShelf(Refrigerator fridge) {
        if (this.numShelves < 5) {
            this.shelves[numShelves] = new String("Shelf " + numShelves);
            this.numShelves += 1;
        } else {
            System.out.println("No more shelves will fit in this fridge!");
        }
    }

    public void addDrawer(Refrigerator fridge, String name) {
        if (this.numDrawers < 3) {
            this.drawers[numDrawers] = new String(name + " drawer");
            this.numDrawers += 1;
        } else {
            System.out.printf("No more drawers will fit in this %s fridge!\n", this.brand);
        }
    }

    // method to print fridge
    public void printFridge(Refrigerator fridge) {
        System.out.println("You have a(n) " + this.brand + " brand fridge!");
        System.out.print("It is currently ");
        if (this.closed) {
            System.out.print("closed and ");
        } else {
            System.out.print("open and");
        }
        if (this.running) {
            System.out.println("running.");
        } else {
            System.out.println("not running.");
        }
        System.out.println("\t" + this.numShelves + " Shelves: ");
        for (int i = 0; i < this.numShelves; i++) {
            System.out.println("\t\t" + this.shelves[i]);
        }
        System.out.println("\t" + this.numDrawers + " Drawers: ");
        for (int i = 0; i < this.numDrawers; i++) {
            System.out.println("\t\t" + this.drawers[i]);
        }
    }
}

public class DiscussionEight {

    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 141 7383. 12.9.2022.\n");

        // init Refrigerators
        Refrigerator firstFridge = new Refrigerator();
        Refrigerator secondFridge = new Refrigerator("Samsung", 0, 0, true, true);

        // first fridge accessing methods
        firstFridge.setBrand(firstFridge, "LG");
        firstFridge.turnOnFridge(firstFridge);
        if (firstFridge.isYourRefrigeratorRunning(firstFridge)) {
            System.out.printf("Your %s refrigerator is running!\n", firstFridge.getBrand(firstFridge));
        }

        // second fridge accessing methods
        secondFridge.addDrawer(secondFridge, "cheese");
        secondFridge.addDrawer(secondFridge, "meat");
        secondFridge.addDrawer(secondFridge, "vegetables");
        secondFridge.addDrawer(secondFridge, "fruit");
        secondFridge.addShelf(secondFridge);
        secondFridge.addShelf(secondFridge);
        secondFridge.addShelf(secondFridge);
        secondFridge.printFridge(secondFridge);

    }
}