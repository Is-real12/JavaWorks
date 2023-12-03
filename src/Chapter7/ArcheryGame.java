package Chapter7;

import java.util.Arrays;
import java.util.Random;

public class ArcheryGame {


            // Function to generate random scores for a player's three chances
            public static int[] generateScores() {
                Random random = new Random();
                int[] scores = new int[3];
                for (int i = 0; i < 3; i++) {
                    scores[i] = random.nextInt(11);
                }
                return scores;
            }


    public static void sortPlayerScores(int[][] playerScores) {
        int n = playerScores.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (playerScores[j][4] < playerScores[j + 1][4]) {
                    int[] temp = playerScores[j];
                    playerScores[j] = playerScores[j + 1];
                    playerScores[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

            int[][] players = new int[4][3];

            for (int i = 0; i < 4; i++) {
                players[i] = generateScores();
            }

            int[][] playerScores = new int[4][5];

            for (int i = 0; i < 4; i++) {
                playerScores[i][0] = i + 1;

                int[] player = players[i];
                int totalScore = 0;
                for (int j = 0; j < 3; j++) {
                    playerScores[i][j + 1] = player[j];
                    totalScore += player[j];
                }
                playerScores[i][4] = totalScore;
            }

            sortPlayerScores(playerScores);

            System.out.println("Player  1st  2nd  3rd  Total");

            for (int[] player : playerScores) {
                System.out.printf("%-7d%-5d%-5d%-5d%-6d%n", player[0], player[1], player[2], player[3], player[4]);
            }

            System.out.println("\nPlayer " + playerScores[0][0] + " wins with a total score of " + playerScores[0][4] + " points!");
        }
// Garbage collector come pack ur dirty oo now now n0w






    private static int func_to_play(int i, Random random) {
       int points =  random.nextInt(0, 10);
        return points;
    }
}
