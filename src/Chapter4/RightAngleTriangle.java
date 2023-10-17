package Chapter4;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE LENGHT OF RIGHT ANGLE TRIANGLE:");
        int userInput = scanner.nextInt();
        for (int row = 1; row<=userInput; row++){
            for (int col = 1; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println("  ");
            }


       int i = 1;
        while (i<= userInput) {
            int j = 1;
            while (j <= i) {
                    System.out.print("*");
                    j++;
                }
                System.out.println();
                i++;
            }
        }
        }




