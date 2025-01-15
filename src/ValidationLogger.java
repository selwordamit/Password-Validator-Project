public class ValidationLogger implements AutoCloseable {

    private static boolean hasLoggedCompletion = false;
    private boolean isSuccess = false;

    // Method to log status and messages
    public void log(String status, String message) {
        System.out.printf("Status: %s | Message: %s%n", status, message);
    }

    // Log success message
    public void logSuccess() {
        isSuccess = true;
        log("SUCCESS", "The password meets all security criteria.");
    }

    // Log failure message
    public void logFailure(String reason) {
        isSuccess = false;
        log("FAILURE", reason);
    }

    // Close method to log completion message
    @Override
    public void close() {
        if (isSuccess && !hasLoggedCompletion) {
            log("INFO", "Password validation process completed.");
            hasLoggedCompletion = true;
        }
    }
}
