
public class InvalidOptionException extends Exception{

    public InvalidOptionException() {
    	super("Wrong Option");
    }
    
    public InvalidOptionException(String s) {
    	super(s);
    }
    
}