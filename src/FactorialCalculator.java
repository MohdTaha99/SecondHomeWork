import java.util.Scanner;

public class FactorialCalculator {

    // Method to calculate the factorial of a number
    public static long calculateFactorial(int number) {
        // Initialize result to 1 (since factorials are products)
        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Return the calculated factorial
        return factorial;
    }

    // Method to get a number from the user and check if it's larger than zero
    public static int getValidNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Loop until a valid number greater than zero is entered
        do {
            System.out.print("Enter a whole number greater than zero: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Invalid input. Please enter a number greater than zero.");
            }
        } while (number <= 0); // Keep asking until a valid number is entered

        return number;
    }

}

