package Others;

import java.util.Arrays;

public class Show {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int start = 0;
        int end = arr.length - 1;
        while (end > start){
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];



            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));



//        int six = 2;
//        int one = 1;
//        for (int i = 0; i < end; i++) {
//
//
//            int temp = arr[i];
//            arr[i] =
//
//
//
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));


    }





















    public static int[] Swapping(int[] arr, int startingSwap, int endingSwap){
    arr[startingSwap] += arr[endingSwap];
    arr[endingSwap] = arr[startingSwap]-arr[endingSwap];
    arr[startingSwap]  -= arr[endingSwap];
return arr;
}
}