package OOPAss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void testForCheckBalance() throws InvalidPinException {
        Account account = new Account("Ware_Ajale", "1234", 1);

        assertEquals(0, account.checkBalance("1234"));

    }
    @Test
    public void testForExcptionTrows() throws InvalidPinException {
        Account account = new Account("Aja_jale", "1234", 1);
        assertThrows(InvalidPinException.class, ()-> account.checkBalance("0921"));
        assertThrows(InvalidAmountException.class, ()-> account.deposit(-3000));
        assertThrows(InsufficientFundException.class, ()-> account.withdraw(70000, "1234"));

    }

    @Test
    public void testForDeposit() throws InvalidAmountException, InvalidPinException {
        Account account = new Account("Aja_jale", "1234", 1);
        account.deposit(2000);
        assertEquals(2000, account.checkBalance("1234"));
    }
    @Test
    public void testForWithdraw() throws InvalidAmountException, InvalidPinException, InsufficientFundException {
        Account account = new Account("Aja_jale", "1234", 1);
        account.deposit(2000);
        account.withdraw(1000, "1031");
        assertEquals(1000, account.checkBalance("1234"));
    }

    @Test
    public void checkThatWeHaveAccountNumber(){
        Account account = new Account("Aja_jale", "1234", 1);
//        assertEquals( 56331104 , account.generateRandomNumber());
    }

}