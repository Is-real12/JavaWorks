package OOPAss;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) throws InvalidAmountException, AccountNotFoundException, OOPAss.AccountNotFoundException, InsufficientFundException {
        Bank bank = new Bank("Usless Bank");
        Scanner scanner = new Scanner(System.in);
        String mainMenu = """
                ************ Hello and Welcome *************
                ********************************************
                ** 1. Create Account                      **
                ** 2. Deposit Money                       **
                ** 3. Check Balance                       **
                ** 4. Transfer Money                      **
                ** 5. Withdraw Money                      **
                ** 6. Remove Account                      **
                ** 7. Find Account                        **
                ** 8. Exit                                **
                ********************************************
                ********************************************
                
                Enter Choice: 
                """;

        int response;
        String pin;
        int number;
        System.out.print(mainMenu);
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                System.out.print("Enter first name: ");
                String firstName = scanner.next()+" ";
                String lastName = scanner.next();
                System.out.print("Create Pin: ");
                pin = scanner.next();

            bank.registerAccount(firstName, lastName, pin);

                break;
            case "2":
                System.out.print("enter amount: ");
                response = scanner.nextInt();
                System.out.print("enter account number ");
                number = scanner.nextInt();
                System.out.print("enter pin ");
                pin = scanner.next();
                bank.withdraw(response, number, pin);


                break;
            case "3":

                break;
            case "4":

                break;
            case "5":
                System.out.print("enter amount: ");
                response = scanner.nextInt();
                System.out.print("enter account number ");
                number = scanner.nextInt();
                bank.deposit(response, number);

                break;
            case "6":

                break;
            case "7":

                break;
            case "8":

                break;
        }
        main(args);
//        printMenu(mainMenu);


    }
    public static void printMenu(String mainMenu){
        System.out.println(mainMenu);
        printMenu(mainMenu);
    }
}
