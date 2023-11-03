package Chapter6;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {


public static void main(String[] args) {
Random random = new Random();
int secretNumber = random.nextInt(100) + 1;
int numberOfGuesses = 0;

Scanner scanner = new Scanner(System.in);

System.out.println("Welcome to Guess the Number Game!");
System.out.println("I have selected a random number between 1 and 100. Try to guess it.");

while (true) {
    System.out.print("Enter your guess: ");
    int userGuess = scanner.nextInt();
    numberOfGuesses++;

    if (userGuess < secretNumber) {
        System.out.println("Too low. Try again.");
    } else if (userGuess > secretNumber) {
        System.out.println("Too high. Try again.");
    } else {
        System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " tries.");

        if (numberOfGuesses <= 10) {
            System.out.println("Aha! You know the secret!");
        } else {
            System.out.println("You should be able to do better! Why should it take no more than 10 guesses?");
        }

        break;
    }

    if (numberOfGuesses >= 10) {
        System.out.println("Sorry, you've reached the maximum number of guesses.");
        System.out.println("The secret number was " + secretNumber);
        break;
    }
}
}
}


