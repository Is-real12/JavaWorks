package Chapter2;

import java.util.Scanner;

public class WorldPopulationCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter current world population: ");
 long currentPopulation = scanner.nextLong();

System.out.print("Enter annual population growth rate (in decimal): ");
double growthRate = scanner.nextDouble();

int years = 1;
while (years <= 5) {
long estimatedPopulation = (long) (currentPopulation * Math.pow(1 + growthRate, years));
System.out.println("Estimated population after " + years + " years: " + estimatedPopulation);
            years++;










        }

       
    }
}