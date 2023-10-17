package Chapter4;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER FIVE INTER: ");
        int enterFive = scanner.nextInt();
        int result1 = enterFive / 10000;
        int result2 = enterFive % 1000;
        int result3 = enterFive % 100;
        int result4 = enterFive % 10;
        int result5 = enterFive % 10;

        if (result5 == result1) {
            System.out.print("This is a palindrome ");
            System.out.printf("%d   %d %n", result1, result5);
        } else {
            System.out.print("This is not a palindrome ");
            System.out.printf("%d   %d %n", result1, result5);
        }
        while (enterFive != -1) {
            System.out.println("ENTER FIVE INTER or enter -1 to finish: ");
            enterFive = scanner.nextInt();
            result1 = enterFive / 10000;
            result2 = enterFive % 1000;
             result3 = enterFive % 100;
            result4 = enterFive % 10;
            result5 = enterFive % 10;

            if (result5 == result1) {
                System.out.print("This is a palindrome ");
                System.out.printf("%d   %d %n", result1, result5);
            } else {
                System.out.print("This is not a palindrome ");
                System.out.printf("%d   %d %n", result1, result5);
            }
        }


        // thank you Jesuuus!!!

    }
}
