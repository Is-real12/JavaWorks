package OOPAss;

public  class InvalidAmountException extends Exception {

    public InvalidAmountException(){

        super("Amount is Invalid");

    }
    public InvalidAmountException(String message){

        super(message);

    }
}


