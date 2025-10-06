import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        boolean done = false;
        String trash = "";


        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("You must enter a valid numeric width!");
            }
        } while (!done);


        done = false;
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("You must enter a valid numeric height!");
            }
        } while (!done);


        in.close();


        double area = width * height;


        double perimeter = 2 * (width + height);


        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));


        System.out.println("\n--- Rectangle Information ---");
        System.out.printf("Width: %.2f\n", width);
        System.out.printf("Height: %.2f\n", height);
        System.out.printf("The Area of the rectangle is: %.2f\n", area);
        System.out.printf("The Perimeter of the rectangle is: %.2f\n", perimeter);
        System.out.printf("The Length of the Diagonal is: %.2f\n", diagonal);
    }
}