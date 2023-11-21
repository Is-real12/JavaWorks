package Chapter7.GamesOfCrap1_000_000;

import java.util.Random;

public class MyGameOfShit {
    public static void main(String[] args) {
        int timesPlay = 30;
        int win =0;
        int losses = 0;
        int[] winCount = new int[21];
        int[] looseCount = new int[21];
        Random random = new Random();

        for (int i = 0; i < timesPlay; i++) {

            boolean game = stimulateGameOfCrap(random, random.nextInt());
            int rolls = getRolls();
            if (game){
                if (rolls <= 20){
                    winCount[rolls]++;
                }
            }else {
                looseCount[rolls]++;
            }
        }
        System.out.println("Wins");
        displayHowManyGamesAreWonAtFirstRoll(winCount);

        System.out.println("Losses");
        displayHowManyGamesAreLossAtFirstRoll(looseCount);

        double chanceOfWinning = (double) getTotalWins(winCount) / timesPlay;
        double lenght =  (double) getRolls() / timesPlay;



    }

    private static void displayHowManyGamesAreLossAtFirstRoll(int[] looseCount) {
        for (int i :looseCount) {
            System.out.printf("Total No of loss is %d",i);

        }

    }


    private static void displayHowManyGamesAreWonAtFirstRoll(int[] winCount) {
        for (int i :winCount) {
            System.out.printf("Total No of win is %d",i);

        }
    }


    private static int total = 0;
   public static void increamentRolls(){
        total++;
   }
   public static int getTotalWins(int[] winCount){
       int totals = 0;
       for (int j : winCount) {
           totals += j;
       }
       return totals;
   }

    private static boolean stimulateGameOfCrap(Random random, int i) {
        while (true) {
            int rand = random.nextInt();
            if (i == rand) {
                return true;
            }
            increamentRolls();
            return false;


            }

    }
        public static int getRolls(){
       return total;
        }


}

