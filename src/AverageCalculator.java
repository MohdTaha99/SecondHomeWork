import java.util.Scanner;

public class AverageCalculator {

    // Method to get 3 numbers from the user and return their average
    public static double calculateAverage() {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Get 3 numbers from the user
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the average
        double average = (num1 + num2 + num3) / 3;

        // Return the average
        return average;
    }

    public static void main(String[] args) {
        // Call the method and display the result
        double result = calculateAverage();
        System.out.println("The average of the three numbers is: " + result);
    }
}

