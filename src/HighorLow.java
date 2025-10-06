import java.util.Random;
import java.util.Scanner;
public class HighorLow
{
    public static void main(String[] args) {

        Random generator = new Random(); // Create a Random object

        int randomNumber = generator.nextInt(10) + 1;

        Scanner in = new Scanner(System.in);
        int userGuess = 0;
        boolean done = false;
        String trash = "";


        do {
            System.out.print("Guess the number (1-10): ");

            if (in.hasNextInt()) {
                userGuess = in.nextInt();
                in.nextLine();


                if (userGuess >= 1 && userGuess <= 10) {
                    done = true;
                } else {

                    System.out.println("\nYour guess must be between 1 and 10 inclusive!");
                }
            } else {

                trash = in.nextLine();
                System.out.println("\nInvalid input: " + trash);
                System.out.println("You must enter a whole number between 1 and 10!");
            }
        } while (!done);


        in.close();


        System.out.println("\n--- Result ---");
        System.out.println("The computer's number was: " + randomNumber);
        System.out.println("Your guess was: " + userGuess);

        if (userGuess == randomNumber) {
            System.out.println("You were **on the money**! You guessed the number correctly! 💰");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was **high**! Try again next time. ⬆️");
        } else { // userGuess < randomNumber
            System.out.println("Your guess was **low**! Try again next time. ⬇️");
        }
    }
}
