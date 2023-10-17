package ArrayAssignment;

import java.util.Arrays;
public class ATMValidityInArrayList {
    public static void main(String[] args) {
    int count = 0;
    String cardType = " ";
    String validity = " ";
    String asthric = " ";
int forPrinting = 0;

        int[] originalArray = {4, 3, 8, 8, 5, 7, 6, 0, 1, 8, 4, 0, 2, 6, 2, 6};
//        originalArray = new int[]{forPrinting};
        int length = originalArray.length;


        for (int i = 0; i < length / 2; i++) {
            int temp = originalArray[i];
            originalArray[i] = originalArray[length - 1 - i];
            originalArray[length - 1 - i] = temp;

            System.out.println(count);
        }

        int sumEvenIndexed = 0;
        int sumOddIndexed = 0;


        for (int i = 0; i < length; i++) {

            if (count ==16-1){
                cardType = " MasterCard";

            } else if (i < 16-1) {
                cardType = " Invalid Card";
                validity = " Invalid";
            }
            count++;


            if (i % 2 == 0) {
                sumOddIndexed += originalArray[i];
            } else {
                int multiplication = originalArray[i] * 2;

                while (multiplication > 0) {
                    sumEvenIndexed += multiplication % 10;
                    multiplication /= 10;
                }
            }
        }




        int totalSum = sumEvenIndexed + sumOddIndexed;
        if (totalSum % 10 ==0){
            validity = " Valid";
        }else {
            validity = " Invalid";
        }


        System.out.println("Total sum: " + totalSum);



        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 39; j++) {
                asthric += "*";
            }
            System.out.println("\n"+asthric+"""
                    
                                **Credit Card Type:   """  + cardType+ """
                    
                                **Credit Card Number:   """  +" "+ Arrays.toString(originalArray) + """
                                
                                **Credit Card Digit Length:   """ +" " + length+ """
                                 
                                **Credit Card Validity Status:   """  + validity+ """
                    
                                """+asthric);

        }
    }
    }
