package OOPAss;

import java.util.Objects;
import java.util.Random;

public class Account {
    private String name;
    private int balance;
    private String pins;
    private int number;
    private  boolean isAvailable = false;

    public Account(String name, String pins, int number) {
        this.name = name;
        this.pins = pins;
        this.number = number;
        this.isAvailable = true;
    }

public void deposit(int amount) throws InvalidAmountException {
        if (amount < 0) {
            throw new InvalidAmountException("Please add a non negative Amount");
        }
    this.balance += amount;
}
    public void withdraw(int amount, String pin) throws InvalidAmountException, InsufficientFundException {
        if (amount > balance){
            throw  new InsufficientFundException("insufficient fund");
        } else if ( amount < 0) {
            throw new InvalidAmountException("Please add a non negative Amount");
        }
        this.balance -= amount;
    }

    public int checkBalance(String pin) throws  InvalidPinException{
        if (!Objects.equals(pin, pins)) {
           throw new InvalidPinException();
        }
        return balance;
    }
    public String toString(){
        return String.format("""
                Account Name: %s
                Account Pin: %s
                Account Number: %s
                """,name, pins, number);
    }

}
