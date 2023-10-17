package MyGivenExcercise;

import java.util.Scanner;

public class ATm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                         Welcome to gigaChad Bank; 
                         If you would like to create a bank Account click yes if not click No: """);
        String yes1 = scanner.next();

        if ("yes".equals(yes1)) {
            System.out.println("please Input your name: ");
            String createName = scanner.nextLine();


            System.out.print("please Create a four digit pin Number: ");
            int createPin = scanner.nextInt();


            System.out.print("please Enter your BVN Number: ");
            int bVn = scanner.nextInt();

            System.out.println("""
                    Account Creation Successful. 
                                                      
                    If would like to deposit click yes or If you would like to exit click No """);
            String depYes = scanner.next();

            if ("yes".equals(depYes)) {
                System.out.print("Enter Amount to Deposit: ");
                int dep1 = scanner.nextInt();
                int depo = dep1 + 0;

                System.out.println("\nAccount Deposit Successful you Have " + depo);


                System.out.println("select which option you want:\n1. transfer. \t\t2. deposit. \t\t3. Withdraw \t\t4. join. \t\t4. Exit.");
                int transfer = 1;
                int deposit = 2;
                int withdraw = 3;
                int join = 4;
                int exit = 5;
                int select = scanner.nextInt();
                if (select == transfer) {
                    System.out.println("Enter Beneficiary Account Number: ");
                    int accNo = scanner.nextInt();
                }


                System.out.println("enter your pin: ");
                int pin = scanner.nextInt();

                if (pin == createPin) {
                    System.out.println("Transfer Successful");
                } else if (pin != createPin) {
                    int count = 5;
                    for (int i = 1; i <= 5; i--) {
                        count--;
                        System.out.println("incorrect pin you have " + count + " more tries!");
                        System.out.println("enter your pin: ");
                        int pin1 = scanner.nextInt();
                        if (pin1 == createPin) {
                            System.out.println("Transfer Successful");
                            break;
                        }
                        if (count == 1) {
                            System.out.println("you have exceeded your tries and your account has been blocked");
                            break;
                        }

                    }
                }
            } else if (depYes != "no" || depYes != "No") {
                System.out.println("thanks for banking with us good Bye");
            }


        }else if ("no".equals(yes1)) {
            System.out.println("thanks for banking with us good Bye");
        }












//        for (count = 0; bVn <= count; count++)
//
//            if ()


    }
}
