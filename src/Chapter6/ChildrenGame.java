package Chapter6;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Scanner;

public class ChildrenGame {
    public static void main(String[] args) {
        Elementary();
    }
    public static void Elementary(){
        String[] correct = {"Very good!","Excellent!", "Nice work!","Keep up the good work"};
        String[] wrong = {"No. Please try again." , "Wrong. Try once more.", "Don't give up!","No. Keep trying."};
        int passes  = 0;
        int fails = 0;
        int times_entry = 0;
        Scanner scanner = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        boolean call_back = true;
        while (call_back){
            int messages = 0;
            int randi = 0;
            int eand2 = 0;
            for (int j = 0; j <1 ; j++) {
                int random = rand.nextInt(2, 10);
                int eand1 = rand.nextInt(2, 10);
                randi = random;
                eand2 = eand1;
                int messages1 = rand.nextInt(0,4);
                messages = messages1;
            }
            System.out.printf("What is %d times %d: ",randi,eand2);
            int user_in = scanner.nextInt();
            times_entry++;
            int result = randi * eand2;

            if (user_in == result){
                passes++;
                System.out.println(correct[messages]+"\nIf you Would like to quit click q ");
                String q = scanner.next();
                if (q.equalsIgnoreCase("q")) {
                    call_back = false;
//                    break;
                }
            }else {
                while (call_back) {


                    System.out.println(wrong[messages]);
                    System.out.printf("What is %d times %d: ",randi,eand2);
                    user_in = scanner.nextInt();
                    if (user_in == result) {
                        call_back = false;
                    }
                    times_entry++;
                    fails++;
                    if (fails == 10){
                        call_back = false;
                    }
                }
            }
            times_entry++;

            if (fails == 10 || passes+fails <= 10 || times_entry == 10){
                call_back = false;
            }
        }
        int pa = ( 100/10) * passes;
        if (pa < 75){
            System.out.println("Please ask your teacher for extra help.");
        }else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }


    }
}