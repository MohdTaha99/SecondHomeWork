import java.util.Scanner;

public class TrafficLightSimulator {

    public static void main(String[] args) {
        // Declare a String variable to represent the light color
        String lightColor;

        // Create a scanner to get the light color from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the current light color
        System.out.print("Enter the traffic light color (Green, Yellow, Red): ");
        lightColor = scanner.nextLine();

        // Convert the input to lower case for case-insensitive comparison
        lightColor = lightColor.toLowerCase();

        // Use conditional statements to determine what action the driver should take
        if (lightColor.equals("green")) {
            System.out.println("Go!");
        } else if (lightColor.equals("yellow")) {
            System.out.println("Slow down!");
        } else if (lightColor.equals("red")) {
            System.out.println("Stop!");
        } else {
            System.out.println("Invalid light color!");
        }
    }
}

