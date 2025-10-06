
import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;
        boolean done = false;
        String trash = "";


        do {
            System.out.print("Enter the temperature in Celsius (C): ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            } else {

                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("You must enter a valid numeric temperature!");
            }
        } while (!done);



        fahrenheit = celsius * 1.8 + 32;


        System.out.printf("\nThe temperature %.2f C is equivalent to %.2f F.\n", celsius, fahrenheit);


        in.close();
    }
}
