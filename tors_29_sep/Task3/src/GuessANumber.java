import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        // Read user input
        //use hasNextInt to check if input is numeric

        if (scan.hasNextInt())
        // if so...
        //   Compare it with the random number
        {
            int guess = scan.nextInt();
            //   If it was NOT the rigth number, let the user try again by calling this method recursively
            if (guess < rnd_number)
            {   // Help the user by revealing wether the guess was lower or higher than the target number
                System.out.println("Too low!"); makeAGuess();
            }
            else if (guess > rnd_number)
            {
                System.out.println("Too high!"); makeAGuess();
            }
            else System.out.println("You guessed it!");
        } //if input was not numeric show an error message and call this method recursively
        else
        {
            System.out.println("Input must be an integer");
            makeAGuess();
        }





    }


}
