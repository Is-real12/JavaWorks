package Chapter6;

import java.util.ArrayList;
import java.util.Arrays;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 8};
        System.out.println(Arrays.toString(Common_Divisor(arr)));
//        int num = 6;
//        for (int i = 2; i < num; i++) {
//            if (num % i ==0){
//                System.out.println(i);
//            }
//
//        }


    }
    public static int[] Common_Divisor(int[] num ){

        ArrayList <Integer> gcd = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = 2; j < num[i]; j++) {
                if ( num[i] % j   == 0){
                    gcd.add(j);

                }
            }
        }
        return converter(gcd);
    }

    public static int[] converter(ArrayList <Integer> gdc1){
        int[] conv = new int[gdc1.size()];
        for (int i = 0; i < gdc1.size() ; i++) {
            conv[i] = gdc1.get(i);
        }

        return conv;
    }
}
