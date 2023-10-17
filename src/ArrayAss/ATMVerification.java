package ArrayAssignment;

import java.util.Scanner;

public class ATMVerification {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, kindly enter your card details to verify;");
     long kalifata = scanner.nextLong();
     long forPrinting = kalifata;
long digit = 0;
int count  = 0;
long mulOfIt = 0;
long oddDigit = 0;
//long[] checkingArray = new long[0];
//long[] faf = new long[8];
        int result = 0;
        String cardType = null;
String asthric = "";
        String validity = null;




       while (kalifata > 0){
           digit = kalifata % 10;

//           checkingArray = new long[]{digit};
           if (count ==16-1){
               cardType = " MasterCard";

           } else if (count <16-1) {
               cardType = " Invalid Card";
               validity = " Invalid";



           }
//           System.out.println(count);
//           System.out.println(Arrays.toString(checkingArray));
            if (count % 2 ==1){
                digit *=2;
                if (digit >= 10){
                    int digit1 = (int) digit/10;
                    int digit2 = (int) digit%10;
                    digit = digit1+digit2;
                }
               result += (int) digit;
            }else {
              oddDigit += digit;
            }

           count++;
           kalifata/=10;
}
        long finalResult = result + oddDigit;
//        System.out.println(finalResult);

       if (finalResult % 10 ==0){
           validity = " Valid";
       }else {
           validity = " Invalid";
       }
//        System.out.println(cardType);

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 39; j++) {
                asthric += "*";
            }
            System.out.println("\n"+asthric+"""
                    
                    **Credit Card Type:   """  + cardType+ """
                    
                    **Credit Card Number:   """  +" "+ forPrinting+ """
                    
                    **Credit Card Digit Length:   """ +" " + count+ """
                     
                    **Credit Card Validity Status:   """  + validity+ """
                    
                    """+asthric);

        }

//        System.out.println(mulOfIt);

//
//        System.out.println(result);
//        System.out.println(oddDigit);
}
}
