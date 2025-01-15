// This exception is thrown when a password fails to meet the required security criteria.

public class WeakPasswordException extends Exception{

    public WeakPasswordException(String message) {
        super(message);
    }
}
