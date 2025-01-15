public class PasswordValidator {
    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 20;

    public void validatePassword(String password, String confirmPassword) throws WeakPasswordException, PasswordMismatchException {
        validatePasswordLength(password);
        validateCharacterTypes(password);
        checkPasswordMatch(password, confirmPassword);
        System.out.println("Password is valid.");
    }

    private void validatePasswordLength(String password) throws WeakPasswordException {
        if (password == null || password.length() < MIN_LENGTH || password.length() > MAX_LENGTH) {
            throw new WeakPasswordException("Password must be between 8 and 20 characters.");
        }
    }

    private void validateCharacterTypes(String password) throws WeakPasswordException {
        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else hasSpecial = true;
        }

        if (!hasLower) throw new WeakPasswordException("Password must contain at least one lowercase letter.");
        if (!hasUpper) throw new WeakPasswordException("Password must contain at least one uppercase letter.");
        if (!hasDigit) throw new WeakPasswordException("Password must contain at least one digit.");
        if (!hasSpecial) throw new WeakPasswordException("Password must contain at least one special character.");
    }

    private void checkPasswordMatch(String password, String confirmPassword) throws PasswordMismatchException {
        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Passwords do not match.");
        }
    }
}
