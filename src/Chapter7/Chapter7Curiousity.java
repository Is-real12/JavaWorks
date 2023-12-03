package Chapter7;

import java.util.Arrays;

public class Chapter7Curiousity {
    public static void main(String[] args) {

        int[][] playerScores = {{1,2,3}, {4,5,6},{7,8,9}};

        for (int i = 0; i < playerScores.length-1; i++) {
            for (int j = 0; j < playerScores.length-1; j+=1) {
                if (playerScores[i][j+1] > playerScores[i][j]) {
//                playerScores[i][j] = playerScores[j][i];
                   int temp = playerScores[i][j+1];
                    playerScores[i][j+1]= playerScores[i][j] ;
                    playerScores[i][j] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(playerScores));
    }
}
