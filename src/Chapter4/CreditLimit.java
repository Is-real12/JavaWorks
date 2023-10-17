package Chapter4;

import java.util.Scanner;

public class CreditLimit {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);


        System.out.print("enter your account number:  ");
        int accountNumber = scanner.nextInt();
        while (accountNumber != -1){

            System.out.print("enter your beginning balance:  ");
            int balanceBeginning = scanner.nextInt();
            System.out.print("enter your item charged:  ");
            int itemCharged = scanner.nextInt();
            System.out.print("enter your credit for month:  ");
            int creditForMonth = scanner.nextInt();
            System.out.print("enter your credit limit:  ");
            int creditLimit = scanner.nextInt();

            int result = balanceBeginning + itemCharged-creditForMonth-creditLimit;
            System.out.println("\nyou new balance is "+ result);
            if(result > creditLimit){
                System.out.println(result + "your Credit limit exceed " + creditLimit);
            }
            System.out.print("enter your account number: (or -1 to stop) ");
            accountNumber = scanner.nextInt();
        }

    }
    }





