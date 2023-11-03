package ArrayAss;


import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {

    }
    public static int[][] swapping(int[][] lol){
        int[][] lols = new int[lol.length][lol.length];

        int index = 0;
        int first = lol.length - 1;
        int sec = lol[first - 1].length;

        for (int i = 0; i < lol.length; i++) {

            for (int j = 0; j < lol.length; j++) {
                lols[i][j] = lol[j][i];
            }
        }
return  lols;
    }
    public static int[] pos(int numStudents, int[]totals){

        int[] positions = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            int position = 1;
            for (int j = 0; j < numStudents; j++) {
                if (totals[j] > totals[i]) {
                    position++;
                }
            }
            positions[i] = position;
        }
return positions;
    }



        }




