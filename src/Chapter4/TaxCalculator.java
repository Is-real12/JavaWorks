package Chapter4;

import java.util.Scanner;

public class TaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your Earnings: ");
        int earnings = scanner.nextInt();
        if (earnings <= 30_000) {
            int per = 15;
            int percentCal = earnings * per / 100;
//\/\/\/\/\/\//\/\/\/\//\/\/\/\/\//\/\/\/\/\//\/\/\/\/\/\///\/\/\/\/\/\//\/\/\/\/\//\/\/\/\/\/\//\/\/\/\/\/\/\//\/\/\/\/\/\//\/\/\/\/\//\/\/\/\/\/\//\/\/\/\//\/\/\/\/\/\//\/\/\/\/\/\/\/\//\/\/\/\/\/\//\/\//\\/\//\/\/\/\            int totalTax = earnings - percentCal;


            System.out.println("your total tax for " + earnings +" is: $"+ percentCal);
        }if (earnings > 30_000) {
            int per1 = 20;
            int percentCal1 = earnings * per1 / 100;
//            int totalTax1 = earnings - percentCal1;
            System.out.println("your total tax for " + earnings + " is: $" + percentCal1);
        }
        while (earnings != -1) {
            System.out.println("Enter your Earnings (or enter -1 to stop): ");
            earnings = scanner.nextInt(); 
            if (earnings <= 30_000){
                int per = 15;
                int percentCal = earnings * per / 100;
//                int totalTax = earnings  - percentCal;

                System.out.println("your total tax for " + earnings +" is: $"+ percentCal);
            }if (earnings > 30_000) {
                int per1 = 20;
                 int percentCal1 = earnings * per1 / 100;
//                int  totalTax1 = earnings  - percentCal1;
                System.out.println("your total tax for " + earnings +" is: $"+ percentCal1);

            }



        }
    }
}
