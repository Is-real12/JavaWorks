package ArrayAss;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingThefNumber {
    public static void main(String[] args) {
        System.out.print("Guess a number from the range of 1 to 1000 ");
        Scanner scanner = new Scanner(System.in);
        int guessNU = scanner.nextInt();
        SecureRandom random = new SecureRandom();
        int randoms = 1 + random.nextInt(1000);
        if (guessNU == randoms) {
            System.out.println("You Fucking Won!!!");
        } else {
            if (guessNU > randoms){
                System.out.println("too high bitch");
            }else {
                System.out.println("Too low bitch either way you are a bitch");
            }
            for (int i = 1; i <= 15; i++) {
                System.out.println("Wrong Input. Guess a Number: ");
                guessNU = scanner.nextInt();
                if (guessNU > randoms){
                    System.out.println("too high bitch");
                }else {
                    System.out.println("Too low bitch either way you are a bitch");
                }
                if (guessNU > 1000){
                    System.out.println("fool enter well infact i dln ves bye");
                    break;
                }
                if (i == 15){
                    System.out.println("aww you loose now go die somwhere the number was "+randoms);

                }
                if (guessNU == randoms) {
                    break;
                }
//
//                }


            }
            System.out.println("You Fucking Won!!!");

        }
    }
}