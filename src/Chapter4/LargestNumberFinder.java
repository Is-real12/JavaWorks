package Chapter4;

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner  tp = new Scanner(System.in);

        int count = 0;
        int largest = 0;


        while (count < 10) {

            System.out.println("ENTER A NUMBER");
            int number = tp.nextInt();


            if ( number > largest) {
                largest = number;
            }
            count++;
        }

            System.out.println("the largest number is "+largest);

        }
    }

