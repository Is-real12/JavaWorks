package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class PixelQuantize {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] access_pIXEL = new int[20];
//        int value =  scanner.nextInt();
//
//        int[] pixel = new int[value];
        int[] arr = {2,1,4,3};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }}

