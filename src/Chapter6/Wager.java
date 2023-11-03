package Chapter6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Wager {

    public static void main(String[] args) {
        crap();
    }

    public static void crap() {
        Random rand = new Random();
        int initialBalance = 1000;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a wager: ");
        int wager = scanner.nextInt();

        if (wager <= initialBalance) {
            while (true) {
                int randNum = rand.nextInt(20);
                System.out.print("Guess a number: ");
                int input = scanner.nextInt();

                if (input == randNum) {
                    initialBalance += wager;
                    System.out.println("You won!!! Your new balance is " + initialBalance);
                } else {
                    initialBalance -= wager;
                    System.out.printf("You made a wrong guess. Your balance is %d\n", initialBalance);

                    if (initialBalance <= 0) {
                        System.out.println("Sorry, you have no balance left to play.");
                        break;
                    }

                    System.out.print("Do you want to play again (y/n)? ");
                    String y_n = scanner.next();

                    switch (y_n) {
                        case "y":
                            if (initialBalance > 0) {
                                System.out.print("Enter your new wager: "+ Arrays.toString(message()));
                                wager = scanner.nextInt();
                            } else {
                                System.out.println("Sorry, you don't have enough to play again. Balance: " + initialBalance);
                                break;
                            }
                            break;
                        case "n":
                            System.out.println("Thanks for playing. Your final balance is: " + initialBalance);
                            return;
                        default:
                            System.out.println("Invalid input. Exiting the game.");
                            return;
                    }
                }
            }
        } else {
            System.out.println("Enter a valid wager less than or equal to your initial balance.");
        }
    }


    public static String[] message() {
    String[] mes = {"Oh, you're going for broke, huh?", "Did you Fuck anyone tonigh ", "Aw c'mon, take a chance! ", "You're up big. Now's the time  Making a Difference 307 to cash in your chips"};
    Random rand = new Random();
        int intp = rand.nextInt(mes.length);
    return new String[]{mes[intp]};
}}