package Chapter6;

import java.util.Scanner;

public class RoundingNumbersApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double originalValue = scanner.nextDouble();


        double roundedValue = Math.floor(originalValue + 0.5);


        System.out.println("Original Value: " + originalValue);
        System.out.println("Rounded Value: " + roundedValue);
    }
}