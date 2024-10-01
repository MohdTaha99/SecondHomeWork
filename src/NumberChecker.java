import java.util.Scanner;

public class NumberChecker {

    // Method to get a number from the user and print whether it's positive or negative
    public static void checkNumber() {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Get a number from the user
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }

}

