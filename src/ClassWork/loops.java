package ClassWork;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//
Scanner scanner = new Scanner(System.in);
int num = scanner.nextInt();
        for  (int one= 1; one<num; one++) {

            System.out.println(one);

        }
//////
//////
//////
//////        while (one<10){
//////            one++;
//////
//////            if (one == 8){
////                one++;
////            }
////            System.out.println(one);
////
////
////        }
//
////
////     int count = 1;
////
////     while (count <= 1_000){
////         System.out.println(count);
////
////
////
////         count = count+1;
////     }
//
//
//        // two number are
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the base number: ");
//        int base = scanner.nextInt();
////
////
//        System.out.print("Enter the exponent number: ");
//        int exponent = scanner.nextInt();
//
////
//        int result = 1;
//        for (int count = 0; count < base; count ++){
//            result *= exponent;
//        }
//        System.out.print(result);
//////final int ola = 2;
//////        System.out.println(ola);
////
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Enter your saving amount: ");
////        int savingsAmount = scanner.nextInt();
////
////            int timesSaved = 0;
////            int timeSaved = savingsAmount * savingsAmount;
////            int allreadyHave = 100;
////        if (savingsAmount == 50) {
////            System.out.println("amount saved");
////        }else
////            System.out.println("wrong savings amount go increase your limit");
////
////
////
////            System.out.println("if you would like to see account balance click yes");
////            String yes = scanner.next();
////
////            if ("yes" != yes) {
////                int saving = allreadyHave + savingsAmount ;
////                System.out.println("your savings after one year is: " + saving);
////            }
////
////            else {
////
////                System.out.println("okay");
////            }
//
//        // default for not equal to is flase == has a default of false when comparing with string
//
//

//        int num = 120;
//                while (num > 50){
//                    System.out.println("infinit loop");
//                    num-=35;
//                }

//        System.out.println("""
//                Enter
//                1-> enter for foode
//                2-> enter for food
//                3-> enter for foodie
//                """);
//
//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
//
//        switch (input) {
//            case 1:
//                System.out.println("foode foode");
//                break;
//
//            case 2:
//                System.out.println("food food");
//                break;
//
//
//            case 3:
//                System.out.println("foodie foode");
//                break;
//
//            default:
//                System.out.println("ode");
//        }


//        System.out.println("enter pin");
//        int userNum= scanner.nextInt();
////        int count = 0;
////        for (userNum = 0; userNum<=5; userNum++) {
////            System.out.println("Re input pin you have " + count + "more tries");
////            count++;
////        }
//        int count = 0;
//        int i = 0;
//            while (i<2){
//                if (i==5) {
//                    System.out.println("Re input pin you have " + count + "more tries");
//                    count++;
//                    i--;
//                }break;
//            }
        System.out.print("please Create a four digit pin Number: ");
        int createPin = scanner.nextInt();

        int cout1 = 5;
        int max = cout1;
        for (int attempt = 1; attempt <= cout1; attempt--) {
            System.out.println("enter your pin: ");
            int pin = scanner.nextInt();

            if (pin == createPin) {
                System.out.println("accout succesful");
                break;
            } else {
                cout1--;
                if (max > 0) {

                    System.out.println("wrong pin you have " + cout1);
                } else {
                    System.out.println("your pin is still wrong barawo and you have " + cout1 + "and your acc has been blocked");
                    break;
                }
            }
        }
    }
}


//        if (pin == createPin) {
//            System.out.println("Transfer Successful");
//        }else {
//            int count = 5;
//            for (int i = 0; i <= 5; i--) {
//                count--;
//                System.out.println("incorrect pin you have " +count+" more tries!");
//                System.out.println("enter your pin: ");
//                int pin1 = scanner.nextInt();
//
//            }
//
//        }






//

