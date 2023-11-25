package OOPAss;

import org.junit.jupiter.api.Test;

import javax.security.auth.login.AccountNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
class BankTest {

    @Test
    public void checkThatYouCanCreateAccount(){
        Bank bank = new Bank("Ole Bank");
        Account newAccount = bank.registerAccount("Adetola", "Ajale", "1031");
        Account account2 = bank.registerAccount("Aje mo ole", "omotola", "1001");

        assertEquals(2, bank.getAccountListSize());
    }

    @Test
    public void checkThatYouCanFindAccountWithAccountNumber() throws AccountNotFoundException, OOPAss.AccountNotFoundException {
        Bank bank = new Bank("Ole Bank");
        Account newAccount = bank.registerAccount("Adetola", "Ajale", "1031");
        Account account2 = bank.registerAccount("Aje mo ole", "omotola", "1001");

        assertEquals(newAccount, bank.findAccount(1));
        assertEquals(account2, bank.findAccount(2));
    }

    @Test
    public void checkThatYouCanCheckAccountBalance() throws AccountNotFoundException, InvalidPinException, OOPAss.AccountNotFoundException {
        Bank bank = new Bank("Ole Bank");
        Account newAccount = bank.registerAccount("Adetola", "Ajale", "1031");

        assertEquals(0, bank.checkBalance(1, "1031"));
    }

    @Test
    public void checkThatYouCanDepositToAccount() throws AccountNotFoundException, InvalidPinException, InvalidAmountException, OOPAss.AccountNotFoundException {
        Bank bank = new Bank("Ole Bank");
        Account newAccount = bank.registerAccount("Adetola", "Ajale", "1031");
        bank.deposit(2000, 1);
        assertEquals(2000, bank.checkBalance(1, "1031"));
    }

    @Test
    public void checkThatYouCanWithdrawFromAccount() throws AccountNotFoundException, InvalidPinException, InvalidAmountException, InsufficientFundException, OOPAss.AccountNotFoundException {
        Bank bank = new Bank("Ole Bank");
        Account newAccount = bank.registerAccount("Adetola", "Ajale", "1031");
        bank.deposit(2000, 1);
        bank.withdraw(100, 1, "1031");
        assertEquals(1900, bank.checkBalance(1, "1031"));
    }

    @Test
    public void checkThatYouCanTransferToAccount() throws AccountNotFoundException, InvalidPinException, InvalidAmountException, InsufficientFundException, OOPAss.AccountNotFoundException {
        Bank bank = new Bank("Ole Bank");
        Account newAccount = bank.registerAccount("Adetola", "Ajale", "1031");
        Account account2 = bank.registerAccount("Aje mo ole", "omotola", "1001");
        bank.deposit(5000, 1);
        bank.transfer(2000, 2, 1,"1031");

        assertEquals(2000, bank.checkBalance(2, "1001"));
        assertEquals(3000, bank.checkBalance(1, "1031"));

    }
    @Test
    public void checkThatYouCanRemoveAccount() throws AccountNotFoundException, InvalidPinException, InvalidAmountException, InsufficientFundException, OOPAss.AccountNotFoundException {
        Bank bank = new Bank("Ole Bank");
        Account newAccount = bank.registerAccount("Adetola", "Ajale", "1031");
        Account account2 = bank.registerAccount("Aje mo ole", "omotola", "1001");
        bank.removeAccount(1, "1031");
        assertEquals(account2, bank.findAccount(2));
//        assertThrows(OOPAss.AccountNotFoundException.class, ()->bank.findAccount(1));

    }



}