package OOPAss;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Scanner;

public class BankMain {
    static Bank bank = new Bank("Usless Bank");

    public static void main(String[] args) throws InvalidAmountException, AccountNotFoundException, OOPAss.AccountNotFoundException, InsufficientFundException, InvalidPinException {
        Account account;
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
                                
                Enter Choice:""" ;

        int response;
        String pin;
        int number;
        int benAc;

        System.out.print(mainMenu+" ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.print("Enter first name: ");
                String firstName = scanner.next() + " ";
                String lastName = scanner.next();
                System.out.print("Create Pin: ");
                pin = scanner.next();

                bank.registerAccount(firstName, lastName, pin);
                System.out.println("Account Created!!! ");
                break;
            case "2":
                System.out.print("Enter amount: ");
                response = scanner.nextInt();
                System.out.print("Enter account number ");
                number = scanner.nextInt();
                bank.deposit(response, number);


                break;
            case "3":
                System.out.print("Enter account number ");
                number = scanner.nextInt();
                System.out.print("Enter Pin: ");
                pin = scanner.next();
                System.out.println("Your Account Balance is: "+bank.checkBalance(number, pin));
                break;
            case "4":
                System.out.println("Enter amount: ");
                response = scanner.nextInt();
                System.out.println("Enter beneficiary account Number: ");
                benAc = scanner.nextInt();
                System.out.println("Enter sender account Number: ");
                number = scanner.nextInt();
                System.out.println("Enter pin: ");
                pin = scanner.next();
                bank.transfer(response, benAc, number, pin);
                System.out.println("You just transfer " + response + "" +
                        "\nAnd your balance is: " + bank.checkBalance(number, pin));
                break;
            case "5":
                System.out.print("Enter amount: ");
                response = scanner.nextInt();
                System.out.print("Enter account number ");
                number = scanner.nextInt();
                System.out.print("Enter pin ");
                pin = scanner.next();
                bank.withdraw(response, number, pin);
                System.out.println("You just withdraw " + response + "" +
                        "\nAnd your balance is: " + bank.checkBalance(number, pin));
                break;
            case "6":
                System.out.print("Enter account number ");
                number = scanner.nextInt();
                System.out.print("Enter pin ");
                pin = scanner.next();
                bank.removeAccount(number, pin);
                System.out.println("You just remove account: "+bank.toString());
                break;
            case "7":
                System.out.print("Enter account number ");
                number = scanner.nextInt();
                bank.findAccount(number);
                break;
            case "8":
                System.out.println("Thanks for banking with us Bye");
                System.exit(0);
                break;
            default:
                System.out.println("Thanks for banking with us Bye");
        }
        main(args);
//        printMenu(mainMenu);


    }
}

