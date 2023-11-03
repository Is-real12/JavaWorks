package Chapter6;
import java.util.Random;
import java.util.Scanner;
public class CoinTossing {
public static void main(String[] args) {
    int headsCount = 0;
    int tailsCount = 0;
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Press Enter to toss the coin or type 'q' to quit.");
        String input = scanner.nextLine();

        if (input.equals("q")) {
            break;
        }

        Coin result = flip();
        if (result == Coin.HEADS) {
            headsCount++;
        } else {
            tailsCount++;
        }

        System.out.println("Coin toss result: " + result);
        System.out.println("Heads: " + headsCount + " Tails: " + tailsCount);
    }

    System.out.println("Final results:");
    System.out.println("Heads: " + headsCount + " Tails: " + tailsCount);
    System.out.println("Thank you for playing!");
}



    public enum Coin { HEADS, TAILS }

    public static Coin flip() {
        Random random = new Random();
        int randomValue = random.nextInt(2);
        if (randomValue == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
}



