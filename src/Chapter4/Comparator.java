package Chapter4;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter an integer: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber == secondNumber){
            System.out.println(0);
        } if (firstNumber > secondNumber){
            System.out.println(1);
        } if (secondNumber > firstNumber) {
            System.out.println(-1);
        }

        while (firstNumber != -2){
            System.out.print("Enter an integer (or -1 to stop): ");
            firstNumber = scanner.nextInt();
            System.out.print("Enter an integer: ");
            secondNumber = scanner.nextInt();

            if (firstNumber == secondNumber){
                System.out.println(0);
            } if (firstNumber > secondNumber){
                System.out.println(1);
            } if (secondNumber > firstNumber) {
                System.out.println(-1);
            }
        }
    }

}
