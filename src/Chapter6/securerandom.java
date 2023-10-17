package Chapter6;

import java.security.SecureRandom;

public class securerandom {
    public static void main(String[] args) {
        SecureRandom numbers = new SecureRandom();

        for (int i = 0; i <16; i++) {
            int theNum = numbers.nextInt(10+10);


                System.out.println(theNum);


        }


    }
}
