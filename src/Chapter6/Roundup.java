package Chapter6;

import java.util.Scanner;

public class Roundup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double originalValue = scanner.nextDouble();

        System.out.println("Original Value: " + originalValue);
        System.out.println("Rounded to Integer: " + roundToInteger(originalValue));
        System.out.println("Rounded to Tenths: " + roundToTenths(originalValue));
        System.out.println("Rounded to Hundredths: " + roundToHundredths(originalValue));
        System.out.println("Rounded to Thousandths: " + roundToThousandths(originalValue));
    }

    public static int roundToInteger(double number) {
        return (int) Math.floor(number + 0.5);
    }

    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }

    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }

    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }



}