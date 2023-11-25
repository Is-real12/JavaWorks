package OOPAss;

public class InvalidPinException extends Exception{
    public InvalidPinException(){

        super("Pin is Invalid");

    }
    public InvalidPinException(String message){

        super(message);

    }
}
