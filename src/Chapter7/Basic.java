package Chapter7;

import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        int[] k  = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[]copy = new int[100];
int start = 0;
int end = k.length-1;
int kk = 9;
        while (end >= 0){
            k[end] += k[start];

//            k[end] = k[start] - k[end];
//            k[end] -= k[start];


            end--;
            start++;

        }
        System.out.println(Arrays.toString(k));
    }
}
