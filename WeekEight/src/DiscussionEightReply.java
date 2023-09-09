
/*
 * Jackson, Terrence
 * CMIS 141 7383
 * 12.9.2022
 */
import java.util.Scanner;

class WashingMachine {
    // maxLoad denotes the maximum load in pound the
    // washing machine can hold
    private double maxLoad;
    // boolean variable denotes that a washing machine
    // can dry the clothes or not
    private boolean hasDryer;

    private double load; // variable to hold current load

    public WashingMachine(double maxLoad, boolean hasDryer) {
        this.maxLoad = maxLoad;
        this.hasDryer = hasDryer;
    }

    // input value for max load
    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public boolean isHasDryer() {
        return hasDryer;
    }

    public void setHasDryer(boolean hasDryer) {
        this.hasDryer = hasDryer;
    }

    // load method loads clothes in the washing machine
    public boolean loadClothes(double load) {
        if ((this.load + load) > maxLoad) {
            // if the load is greater than the maxLoad
            System.out.println(
                    "Do not continue, the washing machine will be overloaded! Max Load: " + maxLoad + " pounds");
            return false;
        } else {
            // else the clothes are loaded
            this.load += load;
            System.out.println("Your clothes are loaded!");
            return true;
        }
    }

    public void unloadClothes() {
        this.load = 0;
        System.out.println("This machine has been unloaded.");
    }

    // only wash method washes the clothes( this is a washing machine)
    public void wash() {
        if (this.load < this.maxLoad) {
            System.out.println("Your clothes will take 30 minutes to be washed!");
        } else {
            System.out.println("Your clothes will take 60 minutes to be washed!");
        }

    }

    // dry clothes method
    public void dryClothes() {
        // if the hasDryer method is true
        if (hasDryer) {
            if (this.load < this.maxLoad) {
                System.out.println("Your clothes will take 30 minutes to be dried!");
            } else {
                System.out.println("Your clothes will take 60 minutes to be dried!");
            }
        } else
            System.out.println("This is a washing machine not a dryer.");
    }
}

public class DiscussionEightReply {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 141 7383. 12.9.2022.\n");

        // instantiating a WashingMachine object
        WashingMachine washingMachine = new WashingMachine(16.9, true);
        double myLoad;
        Scanner doubScanner = new Scanner(System.in);
        boolean cont;

        // get input
        System.out.println(
                "This program takes a load of laundry and tells you information about your washing machine's ability to wash and dry it.");
        System.out.print("Enter your load in pounds, or 0 to stop: ");
        myLoad = doubScanner.nextDouble();

        while (myLoad > 0) {
            // calling the methods
            cont = washingMachine.loadClothes(myLoad);
            if (cont) {
                washingMachine.wash();
                washingMachine.dryClothes();
                washingMachine.unloadClothes();
            } else {
                washingMachine.unloadClothes();
            }
            // get next input
            System.out.print("Enter your load in pounds, or 0 to stop: ");
            myLoad = doubScanner.nextDouble();
        }

        doubScanner.close();

    }
}