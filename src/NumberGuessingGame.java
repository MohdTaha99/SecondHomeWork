import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Step 1: Generate a random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        // Step 2: Create a scanner to get user input
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;  // Initialize user guess
        int attempts = 0;   // Initialize attempt counter

        // Step 3: Start the while loop
        while (userGuess != randomNumber) {
            System.out.print("Enter your guess (1-100): ");
            userGuess = scanner.nextInt();  // Get the user's guess
            attempts++;  // Increment the attempt counter

            // Step 4: Provide feedback
            if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                // Step 5: Correct guess, end the loop
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("It took you " + attempts + " attempts.");
            }
        }

        scanner.close();  // Close the scanner
    }
}

