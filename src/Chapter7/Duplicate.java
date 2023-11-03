package Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value "+(i+1)+": ");
            int idipt = scanner.nextInt();
            arr[i] = idipt;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]){
                    arr[i] = -1;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
