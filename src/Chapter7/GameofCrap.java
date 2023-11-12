package Chapter7;

import java.util.Random;

public class GameofCrap {
    public static void main(String[] args) {
        int numberOfGames = 1000000;
        int[] winsByRoll = new int[21];
        int[] lossesByRoll = new int[21];
        int totalGamesWon = 0;
        int totalGamesLost = 0;
        int totalRolls = 0;

        Random random = new Random();

        for (int i = 0; i < numberOfGames; i++) {
            int rollCount = playCraps(random);

            if (rollCount == 0) {
                totalGamesWon++;
            } else {
                totalGamesLost++;
            }

            if (rollCount <= 20) {
                if (rollCount == 0) {
                    winsByRoll[0]++;
                } else {
                    lossesByRoll[rollCount - 1]++;
                }
            } else {
                lossesByRoll[20]++;
            }

            totalRolls += rollCount;
        }

        System.out.println("Games Won by Roll:");
        displayResults(winsByRoll);

        System.out.println("\nGames Lost by Roll:");
        displayResults(lossesByRoll);

        double winPercentage = (double) totalGamesWon / numberOfGames * 100;
        double averageRolls = (double) totalRolls / numberOfGames;

        System.out.println("\nChances of Winning at Craps: " + winPercentage + "%");
        System.out.println("Average Length of a Game of Craps: " + averageRolls + " rolls");
    }

    private static int playCraps(Random random) {
        // Implement the rules of the craps game here and return the number of rolls needed to finish the game
        // You can use random.nextInt(6) + 1 to simulate rolling a six-sided die
        // Your implementation of the game logic goes here

        // For simplicity, let's assume a basic craps game with no modifications.
        // You may want to refer to a more detailed craps game logic for a realistic simulation.

        // Placeholder for the actual game logic
        return 0;
    }

    private static void displayResults(int[] results) {
        for (int i = 0; i < results.length; i++) {
            if (i == 0) {
                System.out.printf("On the first roll: %d%n", results[i]);
            } else if (i < 20) {
                System.out.printf("On the %d%s roll: %d%n", i + 1, getOrdinalSuffix(i + 1), results[i]);
            } else {
                System.out.printf("After the twentieth roll: %d%n", results[i]);
            }
        }
    }

    private static String getOrdinalSuffix(int number) {
        if (number >= 11 && number <= 13) {
            return "th";
        }
        switch (number % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }

    }
}