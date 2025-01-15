//This exception is thrown when the provided passwords do not match.

public class PasswordMismatchException extends Exception{
    public PasswordMismatchException(String message) {
        super(message);
    }
}
