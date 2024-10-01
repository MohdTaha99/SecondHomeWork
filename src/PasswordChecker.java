import java.util.Scanner;

public class PasswordChecker {

    // Method to check if the password length is between 8 and 12 characters
    public static void checkPasswordLength() {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a password
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check if the password length is greater than 8 and less than 12
        if (password.length() > 8 && password.length() < 12) {
            System.out.println("The password length is valid.");
        } else {
            System.out.println("The password length is invalid. It should be longer than 8 characters and shorter than 12 characters.");
        }
    }


}
