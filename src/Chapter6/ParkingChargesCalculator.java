package Chapter6;

import  java.util.Scanner;

public class ParkingChargesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalReceipts = 0.0;

        System.out.print("Enter the number of customers: ");
        int numCustomers = scanner.nextInt();

        for (int i = 1; i <= numCustomers; i++) {
            System.out.print("Enter hours parked for customer " + i + ": ");
            int hoursParked = scanner.nextInt();

            double minimumCharge = 2.0;


            double additionalChargePerHour = 0.5;


            double maximumCharge = 10.0;


            double charge = minimumCharge;
            if (hoursParked > 3) {
                charge += additionalChargePerHour * (hoursParked - 3);


                if (charge > maximumCharge)
                    charge = maximumCharge;
            }


            System.out.println("Charge for customer " + i + ": $" + charge);


            totalReceipts += charge;
        }


        System.out.println("Total receipts for yesterday: $" + totalReceipts);
    }
}