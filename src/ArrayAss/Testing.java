package ArrayAss;


import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
int[] lol = new int[]{21, 34, 19};
int lowest = lol[1];
        for (int i = 0; i < lol.length; i++) {
            if (lol[i] < lowest){
                lowest = lol[i];
            }

        }
        System.out.println(lowest);

    }
    public static int[][] swapping(int[][] lol){
//        int[][] lol = new int[][]{new int[]{23, 34, 98}, {43, 25, 29}, {40, 35, 79}};
        int[][] lols = new int[lol.length][lol.length];


//        ArrayList<ArrayList<Integer>> lols = new ArrayList<>();

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

    public static int[] LowestSort(int[] arr ){
        int[] sorts = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]){
                    sorts[i] = arr[j];
                }

            }

        }
        return sorts;
    }


        }




