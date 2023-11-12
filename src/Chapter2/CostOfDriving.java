package Chapter2;

import java.util.Scanner;

public class CostOfDriving {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

 System.out.print("Enter the distance to drive (in miles): ");
double distance = input.nextDouble();

System.out.print("Enter the fuel efficiency of the ModaPac.MyumlPractice.car (in miles per gallon): ");
double fuelEfficiency = input.nextDouble();

System.out.print("Enter the price per gallon of fuel: ");
double pricePerGallon = input.nextDouble();

double costOfTrip = (distance / fuelEfficiency) * pricePerGallon;
System.out.printf("The cost of the trip is $%.2f%n", costOfTrip);

        
    }
}