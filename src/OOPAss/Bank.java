package OOPAss;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;

public class Bank {
    Account account;
    private String name;
    private int totalNumberOfAccountCreated;
    private final ArrayList<Account> accountList;

    public Bank(String name) {
        this.name = name;
        this.accountList = new ArrayList<>();
    }
    public void deposit(int anoumt,  int number) throws AccountNotFoundException, InvalidAmountException, OOPAss.AccountNotFoundException {
        if (number-1 > accountList.size()){
            throw new IndexOutOfBoundsException("Account Not Found");
        }
        Account account = findAccount(number);
        account.deposit(anoumt);

    }

    public void withdraw(int amount, int number, String pin) throws AccountNotFoundException, InvalidAmountException, InsufficientFundException, OOPAss.AccountNotFoundException {
        Account account = findAccount(number);
        account.withdraw(amount, pin);
    }
    public void transfer(int amount, int beneficiaryNumber, int senderNumber, String pin) throws InvalidAmountException, InsufficientFundException, OOPAss.AccountNotFoundException {
        Account account = findAccount(senderNumber);
        Account account1 = accountList.get(senderNumber-1);
        Account account2 = accountList.get(beneficiaryNumber-1);
        account1.withdraw(amount, pin);
        account2.deposit(amount);
    }
    public int checkBalance( int number, String pin) throws InvalidPinException, OOPAss.AccountNotFoundException {
        Account account = findAccount(number);

    return account.checkBalance(pin);
    }
    public Account registerAccount(String firstName,  String lastNumber, String pin){
        totalNumberOfAccountCreated++;
        String first_lastName = (firstName_lastname(firstName, lastNumber));
        Account account = new Account(first_lastName, pin, generateRandomNumber(first_lastName));
        accountList.add(account);
        return account;
    }

    private String firstName_lastname(String firstName, String lastNumber) {
        return firstName + lastNumber;
    }

    private int generateRandomNumber(String name) {
        return totalNumberOfAccountCreated;
    }

    public void removeAccount(int number, String pin) throws InvalidPinException, OOPAss.AccountNotFoundException {
        int account = checkBalance(number, pin);
//        Account accountsChanger = registerAccount("OlE", "AjE", "1201");
        accountList.set(number - 1, null); // so here what i did is actually initialize the removed bank to a null account so when call it will nnot be available

//        accountList.remove(number-1);
    }
    public Account findAccount(int number) throws OOPAss.AccountNotFoundException {

        if (!(accountList.get(number-1) == null)){

            return accountList.get(number-1);
        }
        else {
            throw new OOPAss.AccountNotFoundException("Account Not Found");

        }
    }

    public String toString(){
        return String.format("""
                %s
                """, account.toString());
    }


public int getAccountListSize(){
        return totalNumberOfAccountCreated;
}
}
