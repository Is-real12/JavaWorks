package Chapter4;

import java.util.Scanner;

public class SalesMan {
    public static void main(String[] args) {
        Scanner tp = new Scanner(System.in);
        System.out.print("Enter the amount of sales made for last week: $");
        int amountSold = tp.nextInt();
        while (amountSold != -1) {
            int weeklyPay = 200;

            int percentage = 9;

            int resultPercent = amountSold * percentage / 100;

            int totalPay = weeklyPay + resultPercent;

            System.out.println("your total pay is $" + totalPay);

            System.out.print("Enter the amount of sales made for last week  (or -1 to terminate): $");
            amountSold = tp.nextInt();
        }

    }
}
