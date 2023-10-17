package Chapter2;

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER AN INVESTMENT: ");
        double dep = scanner.nextInt();

        for (int i = 1; i<=30; i++){
            double roi = dep * 0.10;
            double newAm = roi + dep;
            dep = newAm;
            System.out.println("your roi is $"+roi+" and your investment is $"+ newAm +" in year "+i);
        }
    }
}
