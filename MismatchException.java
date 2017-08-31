
public class MismatchException extends Exception{

    public MismatchException() {
    	super("IDcode does not match!");
    }
    
    public MismatchException(String s) {
    	super(s);
    }
    
    
}