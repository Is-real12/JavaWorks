package OOPAss;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(){

        super("Insufficient funds ");

    }
    public InsufficientFundException(String message){

        super(message);

    }
}
