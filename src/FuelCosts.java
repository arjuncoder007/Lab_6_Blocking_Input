import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0.0;
        double mpg = 0.0;
        double pricePerGallon = 0.0;
        boolean done = false;
        String trash = "";

        // --- 1. Get Gallons in Tank ---
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("You must enter a valid number for gallons!");
            }
        } while (!done);

        // --- 2. Get Fuel Efficiency (MPG) ---
        done = false;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon (MPG): ");
            if (in.hasNextDouble()) {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("You must enter a valid number for MPG!");
            }
        } while (!done);

        // --- 3. Get Price Per Gallon ---
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("You must enter a valid number for the price!");
            }
        } while (!done);

        // --- Close Scanner ---
        in.close();
        double gallonsNeededFor100Miles = 100 / mpg;
        double costFor100Miles = gallonsNeededFor100Miles * pricePerGallon;


        double distanceWithFullTank = gallons * mpg;

        // --- Output ---
        System.out.println("\n--- Fuel Costs Summary ---");
        System.out.printf("The cost to drive 100 miles is: $%.2f\n", costFor100Miles);
        System.out.printf("The car can go %.2f miles with a full tank of gas.\n", distanceWithFullTank);
    }
}
