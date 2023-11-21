package Chapter7;

import java.util.Arrays;
import java.util.Random;

public class DiceRollV {
    public static void main(String[] args) {


        int numberOfTimes = 5;
        int[] varier = new int[9];
        Random random = new Random();
        for (int i = 0; i < numberOfTimes; i++) {
            int first = random.nextInt(6) + 1;
            int second = random.nextInt(6) + 1;

            int sum = first + second;
            varier[sum-2]++;

        }
        System.out.println(Arrays.toString(varier));
//        System.out.println("Topper");
//        for (int i = 2; i <12 ; i++) {
//            System.out.printf("%s\t\t",varier[i]);
//        }

    }
}