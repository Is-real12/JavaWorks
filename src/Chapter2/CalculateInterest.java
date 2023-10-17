import java.util.Scanner;

public class CalculateInterest {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        // Read the balance from the user
System.out.print("Enter the balance: ");
        double balance = scanner.nextDouble();

        // Read the annual percentage interest rate from the user
System.out.print("Enter the annual percentage interest rate: ");
double annualInterestRate = scanner.nextDouble();

        // Calculate the interest for the next month
double interest = balance * (annualInterestRate / 1200);

        // Display the interest for the next month
System.out.println("Interest for the next month: $" + interest);

        scanner.close();
    }
}