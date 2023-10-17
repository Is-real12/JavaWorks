import java.util.Scanner;

public class PoundToKilogramConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number in pounds
        System.out.print("Enter the weight in pounds: ");
        double pounds = scanner.nextDouble();

        // Convert pounds to kilograms
        double kilograms = pounds * 0.454;

        // Display the result
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");

        // Close the Scanner
        scanner.close();
    }
}